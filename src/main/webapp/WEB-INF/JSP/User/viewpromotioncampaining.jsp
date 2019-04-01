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
            promotion
            <small>view</small>
        </h1>
        <br>
        <input type="button" class="btn btn-primary" name="addbrand" value="Add Promotion" onclick="window.location.href = '${pageContext.servletContext.contextPath}/PromationCampainingpage'">
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
                                    <th>Promotion Id</th>
                                    <th>Title</th>
                                    <th>Description</th>
                                    <th>Promotion Date</th>
                                    <th>Promotion Time</th>
                                    <th>Edit</th>
                                    <th>Delete</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:set var="count" value="1"/>
                                <c:forEach items="${lstpromotion}" var="promotion">
                                    <tr>
                                        <td>${count}</td>
                                        <td>${promotion.promotionid}</td>
                                        <td>${promotion.title}</td>
                                        <td>${promotion.description}</td>
                                        <td>${promotion.promotionDate}</td>
                                        <td>${promotion.promotionTime}</td>
                                        <td><a href="${pageContext.servletContext.contextPath}/editpromotion/${promotion.promotionid}" style="font-size: 22px;"><i class="fa fa-edit"></i></a></td>
                                        <td><a href="${pageContext.servletContext.contextPath}/deletepromotion/${promotion.promotionid}" style="font-size: 22px;"><i class="fa fa-trash"></i></a></td>

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