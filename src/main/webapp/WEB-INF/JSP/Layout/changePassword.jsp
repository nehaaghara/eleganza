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
            Change Password
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
                        <h3 class="box-title"></h3>
                    </div>
                    <form:form action="" modelAttribute="tblUser" method="post">
                        <form:hidden path="userid" name="userid" />
                        <div class="box-body">
                            <div class="form-group">
                                <label for="Title">Old Password</label>
                                <form:input path="password" name="password" class="form-control" id="first_name" title="first_name"  placeholder="Enter First Name" autofocus="on"/>
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="form-group">
                                <label for="Title">New Password</label>
                                <form:input path="password" name="password" class="form-control" id="last_name" title="last_name"  placeholder="Enter Description" autofocus="on"/>
                            </div>
                        </div>
                        <!-- /.box-body -->
                        <div class="box-footer">
                            <input type="submit" name="save" value="Save & Exit" class="btn btn-primary"/>
                            <input type="button" name="action" value="Cancel" class="btn btn-primary" onclick="window.location.href = '${pageContext.servletContext.contextPath}/viewAdvertisement'"/>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
</div>
</div>
<!-- /.content-wrapper -->


