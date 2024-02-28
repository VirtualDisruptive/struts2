package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.InvoiceBean;

public class InvoiceAction extends ActionSupport  {

    InvoiceBean invoiceBean;

    @Override
    public String execute() throws Exception {
       this.calculate();
        return SUCCESS;
    }

    public InvoiceBean getInvoiceBean() {
        return invoiceBean;
    }

    public void setInvoiceBean(InvoiceBean invoiceBean) {
        this.invoiceBean = invoiceBean;
    }
    @Override
    public void validate() {
        if (invoiceBean.getSubject().isEmpty()) {
            addFieldError("invoiceBean.subject", "El concepto es obligatorio.");
        }

        if(invoiceBean.getDateTo()==null){
            addFieldError("invoiceBean.dateTo", "Esta fecha es obligatoria.");
        }

        if(invoiceBean.getDateFrom()==null){
            addFieldError("invoiceBean.dateFrom", "Esta fecha es obligatoria.");
        }

        if(invoiceBean.getGrossAmount() <=  0.0){
            addFieldError("invoiceBean.grossAmount", "La cantidad bruta tiene que ser definida.");
        }



    }

    private void calculate() {
        double number = invoiceBean.getGrossAmount();
        double ivaPercetantage = 0.21;
        double iva = (number * ivaPercetantage);
        double total = number + iva;
        invoiceBean.setTotalAmount(total);
    }
}
