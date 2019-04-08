<%-- 
    Document   : viewCustomer
    Created on : Nov 15, 2018, 6:28:43 PM
    Author     : ITMCS
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
            Employee Schedule
            <small>view</small>
        </h1>
        <br>
        <input type="button" class="btn btn-primary" name="addbrand" value="Add  Employee Schedule" onclick="window.location.href = '${pageContext.servletContext.contextPath}/employeeschedulepage'">
    </section>
    <section class="content">
        <div class="row">
            <div class="col-xs-12">
                <div class="box">
                    <!-- /.box-header -->
                    <div class="box-body">
                        <div id="divAltMsg"></div>
                       <table id="example" class="display" style="width:100%">
                            <thead>
                                <tr>
                                    <th>No.</th>
                                    <th>Employee Id</th>
                                    <th>User Name</th>
                                    <th>Date</th>
                                    <th>Time</th>
                                    <th>Flag</th>
                                    <th>Edit</th>
                                    <th>Delete</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:set var="count" value="1"/>
                                <c:forEach items="${alldataoftblemployeeschedule}" var="alldataoftblemployeeschedule">
                                    <tr>
                                        <td>${count}</td>
                                        <td>${alldataoftblemployeeschedule.empid}</td>
                                        <td>${alldataoftblemployeeschedule.tblUser.username}</td>
                                        <td>${alldataoftblemployeeschedule.date}</td>
                                        <td>${alldataoftblemployeeschedule.time}</td>
                                        <td>${alldataoftblemployeeschedule.flag}</td>
                                        <td><a href="${pageContext.servletContext.contextPath}/editemployeeschedule/${alldataoftblemployeeschedule.empid}" style="font-size: 22px;"><i class="fa fa-edit"></i></a></td>
                                        <td><a href="${pageContext.servletContext.contextPath}/deleteemployeeschedule/${alldataoftblemployeeschedule.empid}" style="font-size: 22px;"><i class="fa fa-trash"></i></a></td>
                                    </tr>
                                   <c:set var="count" value="${count+1}"/>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
                <!-- /.box-body -->
            </div>
            <!-- /.box -->
        </div>
        <!-- /.col -->

        <!-- /.row -->
    </section>

</div>
<script src="${pageContext.servletContext.contextPath}/webresource/admin/dist/js/commonJs.js"></script>
<script>
            $(document).ready(function () {
                $('#example').DataTable();
            });
</script>