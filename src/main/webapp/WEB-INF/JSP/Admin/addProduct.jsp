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
            Product
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
                        <h3 class="box-title">Add Product</h3>
                    </div>
                    <form:form action="${pageContext.servletContext.contextPath}/saveproduct" modelAttribute="tblProduct" method="post">
                        <form:hidden path="productId" name="productId" />
                        <div class="box-body">
                            <div class="form-group">
                                <label for="serviceName">Product Name </label>
                                <form:input path="productName" name="productName" required="true" class="form-control" id="productName" title="productName"  placeholder="Enter Product Name" autofocus="on"/>
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="form-group">
                                <label for="manufacture">Manufacture</label>
                                <form:input path="manufacture" name="manufacture" required="true" class="form-control" id="manufacture" title="manufacture"  placeholder="Enter Manufacture" />
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
                                <label for="cost">Cost</label>
                                <form:input path="cost" name="cost" class="form-control" required="true" id="cost" title="cost"  placeholder="Enter Cost" />
                            </div>
                        </div>
                        <!-- /.box-body -->
                        <div class="box-footer">
                            <input type="submit" name="save" value="Save & Exit" class="btn btn-primary"/>
                            <input type="submit" name="saveAndNew" value="Save & New" class="btn btn-primary"/>
                            <input type="button" name="action" value="Cancel" class="btn btn-primary" onclick="window.location.href = '${pageContext.servletContext.contextPath}/viewproduct'"/>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
</div>
</div>
<!-- /.content-wrapper -->


