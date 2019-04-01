<%-- 
    Document   : selleraddbrand
    Created on : Mar 7, 2019, 11:49:34 AM
    Author     : ITMCS-PC
--%>



<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div class="content-wrapper">
    <section class="content-header">
        <h1>
            Admin Service
            <small>
                Add
            </small>
        </h1>
    </section>
    <section class="content">
        <div class="row">
            <!-- left column -->
            <div class="col-md-6">
                <!-- general form elements -->
                <div class="box box-primary">
                    <div class="box-header with-border">
                        <h3 class="box-title">Add  Admin Service</h3>
                    </div>
                    <form:form action="${pageContext.servletContext.contextPath}/saveAdminPackage" modelAttribute="tblPackage" method="post">
                        <form:hidden path="package_Id" name="package_Id" />
                        <div class="box-body">
                            <div class="form-group">
                                <label for="serviceName">Creation Date </label>
                                <form:input type="date" path="creationDate" class="form-control form-filter input-sm" name="creationDate" placeholder="" />        
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="form-group">
                                <label for="description">Expiry Date</label>
                                <form:input type="date" path="expiryDate" placeholder="" class="form-control form-filter input-sm" name="expiryDate" />
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="form-group">
                                <label for="charges">Description</label>
                                <form:textarea  path="description" class="form-control form-filter input-sm" name="description"/>
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="form-group">
                                <label for="charges">Cost</label>
                                <form:input path="cost" name="cost" type="text" class="form-control"/>
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="form-group">
                                <label for="charges">Services</label>
                                <form:select path="serviceId.service_Id" title="Branch" name="service_Id" id="service_Id"  class="form-control select2" style="width: 100%;">
                                    <option value="-1" disabled="true" selected="true">Please Select</option>
                                    <c:forEach items='${lstAdvertisementTopic}' var='entry'>
                                        <option value="${entry.service_Id}">${entry.serviceName}</option> 
                                    </c:forEach>  
                                </form:select> </div>
                        </div>
                        <!-- /.box-body -->
                        <div class="box-footer">
                            <input type="submit" name="save" value="Save & Exit" class="btn btn-primary"/>
                            <input type="submit" name="saveAndNew" value="Save & New" class="btn btn-primary"/>
                            <input type="button" name="action" value="Cancel" class="btn btn-primary" onclick="window.location.href = '${pageContext.servletContext.contextPath}/viewAdminPackage'"/>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
</div>
</div>
<!-- /.content-wrapper -->


