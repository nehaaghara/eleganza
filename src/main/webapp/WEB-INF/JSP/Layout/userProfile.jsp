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
            Change Your Profile Inforamtion
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
                    <form:form action="${pageContext.servletContext.contextPath}/updateprofile/${sessionScope.sessionuser.userid}" modelAttribute="tblUser" onsubmit="return submitProfile();" method="post">
                        <form:hidden path="userid" value="${sessionScope.sessionuser.userid}" name="userid" />
                        <div class="box-body">
                            <div class="form-group">
                                <label for="Title">First Name</label>
                                <form:input path="first_name" name="first_name" value="${sessionScope.sessionuser.first_name}" class="form-control" id="first_name" title="first_name" validator="required,alphabetic" onblur="validate(this)"  placeholder="Enter First Name" autofocus="on" />
                                <span for="first_name" class="help-block"><form:errors path="first_name"/></span>
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="form-group">
                                <label for="Title">Last Name</label>
                                <form:input path="last_name" name="last_name" value="${sessionScope.sessionuser.last_name}" class="form-control" id="last_name" title="last_name" validator="required,alphabetic" onblur="validate(this)"  placeholder="Enter Last Name" autofocus="on"/>
                                <span for="last_name" class="help-block"><form:errors path="last_name"/></span>
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="form-group">
                                <label for="Title">User Name</label>
                                <form:input path="username" name="username" value="${sessionScope.sessionuser.username}" class="form-control" id="username" title="username" validator="required,alphanum" onblur="validate(this)"  placeholder="Enter User Name" autofocus="on"/>
                                <span for="username" class="help-block"><form:errors path="username"/></span>
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="form-group">
                                <label for="Title">Email Address</label>
                                <form:input path="email_address" name="email_address" value="${sessionScope.sessionuser.email_address}" class="form-control" id="email_address" title="email_address"  validator="required" onblur="validate(this)" placeholder="Enter Mail Id" autofocus="on"/>
                                <span for="email_address" class="help-block"><form:errors path="email_address"/></span>
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="form-group">
                                <label for="Title">Contact Number</label>
                                <form:input path="contect" name="contect" class="form-control" value="${sessionScope.sessionuser.contect}" id="contect" title="contect"  validator="required,numeric" onblur="validate(this)" placeholder="Enter Description"/>
                                <span for="contect" class="help-block"><form:errors path="contect"/></span>
                            </div>
                        </div>
                        <!-- /.box-body -->
                        <div class="box-footer">
                            <input type="submit" name="save" value="Save & Exit" class="btn btn-primary"/>
                            <input type="button" name="action" value="Cancel" class="btn btn-primary" onclick="window.location.href = '${pageContext.servletContext.contextPath}/profileInformation'"/>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
</div>
</div>
<!-- /.content-wrapper -->

<script src="${pageContext.servletContext.contextPath}/webresource/js/userJs/profileJs.js"></script>
<script src="${pageContext.servletContext.contextPath}/webresource/js/userJs/commonJs.js"></script>
