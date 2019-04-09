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
                    <form:form action="${pageContext.servletContext.contextPath}/saveAdminService" modelAttribute="tblAdminService" method="post">
                        <form:hidden path="service_Id" name="service_Id" />
                        <div class="box-body">
                            <div class="form-group">
                                <label for="serviceName">Service Name: </label>
                                <form:input path="serviceName" name="serviceName" required="true" class="form-control" id="serviceName" title="serviceName"  placeholder="Enter Service Name" autofocus="on"/>
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="form-group">
                                <label for="description">Description</label>
                                <form:input path="description" name="description" required="true" class="form-control" id="description" title="description"  placeholder="Enter Description" />
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="form-group">
                                <label for="charges">Charges</label>
                                <form:input path="charges" name="charges" required="true" class="form-control" id="charges" title="charges"  placeholder="Enter Charges" />
                            </div>
                        </div>
                        <!-- /.box-body -->
                        <div class="box-footer">
                            <input type="submit" name="save" value="Save & Exit" class="btn btn-primary"/>
                            <input type="submit" name="saveAndNew" value="Save & New" class="btn btn-primary"/>
                            <input type="button" name="action" value="Cancel" class="btn btn-primary" onclick="window.location.href = '${pageContext.servletContext.contextPath}/viewAdminService'"/>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
</div>
</div>
<!-- /.content-wrapper -->


