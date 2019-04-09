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
            Appointment
            <small>
                Take
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
                        <h3 class="box-title">Take Appointment</h3>
                    </div>
                    <form:form action="${pageContext.servletContext.contextPath}/saveappointment" modelAttribute="tblAppointment" method="post">
                        <form:hidden path="appointmentId" name="appointmentId" />
                        <div class="box-body">

                            <div class="form-group">
                                <label for="exampleInputAdminBrand">Your Name</label>
                                <form:label path="userFk.userid" name="title" class="form-control">${sessionScope.sessionuser.first_name}</form:label>
                                <span for="userFk" class="help-block"><form:errors path="userFk"/></span>
                            </div>
                            <div class="form-group">
                                <label for="Title">Select Employee</label>
                                <form:select path="empFk.empid" title="empid" name="empFk.empid" id="empid" class="form-control select2" style="width: 100%;">
                                    <option value="-1" disabled="true" selected="true">Please Select</option>
                                    <c:forEach items='${lstEmployee}' var='entry'>
                                        <option value="${entry.empid}">${entry.tblUser.first_name}</option> 
                                    </c:forEach>  
                                </form:select>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputAdminBrand">Date</label>
                                <form:input type="date"  path="transientdate" class="form-control"  placeholder="Enter Date" />
                                <span for="transientdate" class="help-block"><form:errors path="transientdate"/></span>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputAdminBrand">Time</label>
                                <form:input type="time" path="transienttime"  class="form-control" placeholder="Enter Time" />
                                <span for="transienttime" class="help-block"><form:errors path="transienttime"/></span>
                            </div>
                        </div>
                        <!-- /.box-body -->
                        <div class="box-footer">
                            <input type="submit" name="save" value="Save & Exit" class="btn btn-primary"/>
                            <input type="submit" name="saveAndNew" value="Save & New" class="btn btn-primary"/>
                            <input type="button" name="action" value="Cancel" class="btn btn-primary" onclick="window.location.href = '${pageContext.servletContext.contextPath}/viewAppointment'"/>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
</div>
</div>
<!-- /.content-wrapper -->


