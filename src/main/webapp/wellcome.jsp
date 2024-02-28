<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
<head>
  <title><s:text name="hello.message"/></title>
  <s:head/>
  <sx:head/>
</head>

<body>

    <h1>Resumen de factura: </h1>

    <p><strong><s:text name="form.subject.message"/></strong>: <s:property value="invoiceBean.subject" /></p>
    <p><strong><s:text name="form.grossAmount.message"/></strong>: <s:property value="invoiceBean.grossAmount" /></p>
    <p><strong><s:text name="form.fromDate.message"/></strong>: <s:property value="invoiceBean.dateFrom" /></p>
    <p><strong><s:text name="form.toDate.message"/></strong>: <s:property value="invoiceBean.dateTo" /></p>
    <p><strong><s:text name="form.totalAmount.message"/></strong>: <s:property value="invoiceBean.totalAmount" /></p>


</body>
</html>