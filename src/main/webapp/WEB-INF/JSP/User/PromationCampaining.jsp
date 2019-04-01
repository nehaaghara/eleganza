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
            Promotion Campaining
            <small>
              
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
                        <h3 class="box-title">Add Promation Campaining</h3>
                    </div>
                    <form:form action="${pageContext.servletContext.contextPath}/savepromationdata" modelAttribute="promationCamp" method="get">
                        <form:hidden path="promotionid" name="promotionid" />
                        <div class="box-body">
                           
                             <div class="form-group">
                                <label for="exampleInputAdminBrand">Title</label>
                                <form:input path="title" class="form-control"  placeholder="Title" autofocus="on"/>
                                <span for="brandName" class="help-block"><form:errors path="title"/></span>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputAdminBrand">Description</label>
                                <form:input path="description"  class="form-control"  placeholder="Description" />
                                <span for="brandName" class="help-block"><form:errors path="description"/></span>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputAdminBrand">Date</label>
                                <form:input type="date"  path="date" class="form-control"  placeholder="Description" />
                                <span for="brandName" class="help-block"><form:errors path="date"/></span>
                            </div><!--
-->                         <div class="form-group">
                                <label for="exampleInputAdminBrand">Time</label>
                                <form:input type="time" path="time"  class="form-control" placeholder="time" />
                                <span for="brandName" class="help-block"><form:errors path="time"/></span>
                            </div>
                        </div>
                        <!-- /.box-body -->
                        <div class="box-footer">
                            <input type="submit" name="save" value="Save & Exit" class="btn btn-primary"/>
                            <input type="submit" name="saveAndNew" value="Save & New" class="btn btn-primary"/>
                            <input type="button" name="action" value="Cancel" class="btn btn-primary" onclick="window.location.href = '${pageContext.servletContext.contextPath}/viewpromotionpage'"/>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
</div>
</div>
<!-- /.content-wrapper -->


