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
            Employee 
            <small>
              Schedule
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
                        <h3 class="box-title">Add Employee Schedule</h3>
                    </div>
                    <form:form action="${pageContext.servletContext.contextPath}/savedataofemployeeschedule" modelAttribute="emplyoeeSchedule" method="get">
                        <form:hidden path="empid" name="empid" />
                        <div class="box-body">
                         
                            <div class="form-group">
                                <label for="exampleInputAdminBrand">User:</label></br>
                                <form:select path="tblUser.userid" style="width:100% " class="form-control select2">
                                <option value="-1" disabled="true" selected="true">Please Select</option>
                                    <c:forEach var="user" items="${alluser}">
                                          <option value="${user.userid}"  selected="true">${user.username}</option>
                                    </c:forEach>
                                </form:select>
                                
                            </div>
                           
                            <div class="form-group">
                                <label for="exampleInputAdminBrand">Date</label>
                                <form:input type="date"  path="temdate" class="form-control"  placeholder="Description" />
                                <span for="brandName" class="help-block"><form:errors path="temdate"/></span>
                            </div>
                        <div class="form-group">
                                <label for="exampleInputAdminBrand">Time</label>
                                <form:input type="time" path="temtime"  class="form-control" placeholder="time" />
                                <span for="brandName" class="help-block"><form:errors path="temtime"/></span>
                            </div>
                        </div>
                        <!-- /.box-body -->
                        <div class="box-footer">
                            <input type="submit" name="save" value="Save & Exit" class="btn btn-primary"/>
                            <input type="submit" name="saveAndNew" value="Save & New" class="btn btn-primary"/>
                            <input type="button" name="action" value="Cancel" class="btn btn-primary" onclick="window.location.href = '${pageContext.servletContext.contextPath}/viewemployeeschedulepage'"/>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
</div>
</div>
<!-- /.content-wrapper -->



