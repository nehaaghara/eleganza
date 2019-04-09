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
                    <form:form action="${pageContext.servletContext.contextPath}/savedataofemployeeschedule" modelAttribute="emplyoeeSchedule" method="get" onsubmit="return submitEmp();">
                        <form:hidden path="empid" name="empid" />
                        <div class="box-body">
                         
                            <div class="form-group">
                                <label for="User">User:</label></br>
                                <form:select path="tblUser.userid" style="width:100% " id="userId" class="form-control select2" onblur="return submitEmp();">
                                <option value="-1" disabled="true" selected="true">Please Select</option>
                                    <c:forEach var="user" items="${alluser}">
                                          <option value="${user.userid}">${user.username}</option>
                                    </c:forEach>
                                </form:select>
                                 <span for="tblUser.userid" class="help-block"><form:errors path="tblUser.userid"/></span>
                            </div>
                           
                            <div class="form-group">
                                <label for="Date">Date</label>
                                <form:input type="date"  path="temdate" class="form-control"  id="date" required="true" placeholder="Description" />
                               </div>
                        <div class="form-group">
                                <label for="Time">Time</label>
                                <form:input type="time" path="temtime"  class="form-control" id="time" required="true"  placeholder="time" />
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
<script src="${pageContext.servletContext.contextPath}/webresource/js/userJs/commonJs.js"></script>
<script>
    
    function submitEmp() {
      $('.error').remove();
    var errorCount = 0;
    if ($('#userId').val() == null) {
        errorCount++;
        addErrormessage('userId', 'Required');
    } 
  
      if (parseInt(errorCount) > 0) {
        return false;
    } else {
        return true;
    }
    }
</script>


