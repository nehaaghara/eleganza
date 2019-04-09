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
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<!DOCTYPE html>

<div class="content-wrapper">
    <section class="content-header">
        <h1>
            Payment
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
                    <form:form action="${pageContext.servletContext.contextPath}/savepayment" modelAttribute="tblPayment" method="post">
                        <form:hidden path="paymentId" name="paymentId" />
                        <div class="box-body">
                            <div class="form-group">
                                <label for="packageName">Your Name</label>
                                <form:label path="userFk.userid" name="title" class="form-control">${sessionScope.sessionuser.first_name}</form:label>
                                </div>
                                <div class="form-group">
                                    <label for="serviceFK">Select Package</label>
                                <form:select path="packageFk.package_Id" title="packageName" name="packageFk" id="packageFk" class="form-control select2" style="width: 100%;" onchange="submitPackage();">
                                    <option value="-1" disabled="true" selected="true">Please Select</option>
                                    <c:forEach items='${lstPackages}' var='entry'>
                                        <option value="${entry.package_Id}">${entry.packageName}</option> 
                                    </c:forEach>  
                                </form:select>
                                <span for="packageFk.package_Id" class="help-block"><form:errors path="packageFk.package_Id"/></span>
                            </div>
                            <div class="form-group">
                                <label for="charges">Cost</label>
                                <form:input path="amount" disabled="true" readonly="true" name="amount" type="text" id="cost" class="form-control"/>
                            </div>

                            <!-- /.box-body -->
                            <div class="box-footer">
                                <input type="submit" name="save" value="Pay & Exit" class="btn btn-primary"/>
                                <input type="submit" name="saveAndNew" value="Pay & New" class="btn btn-primary"/>
                                <input type="button" name="action" value="Cancel" class="btn btn-primary" onclick="window.location.href = '${pageContext.servletContext.contextPath}/viewPayment'"/>
                            </div>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
</div>
<!-- /.content-wrapper -->
<script src="${pageContext.servletContext.contextPath}/webresource/js/userJs/AdminServiceJs.js"></script>
<script>
                                    function submitPackage() {
                                        var id = $("#packageFk").val();
                                        var path = '${pageContext.servletContext.contextPath}';
                                        if (id !== "-1") {
                                            document.getElementById("cost").disabled = false;
                                            id = $("#packageFk").val();
                                            $.ajax({
                                                url: path + '/fetchAmount',
                                                type: "POST",
                                                data: {'packageFk': id},
                                                success: function (result) {
                                                    var branchJson = JSON.parse(result);
                                                    bindBranchDropDown(branchJson);
                                                 },
                                                error: function (error) {
                                                    console.log(error.responseText);
                                                }
                                            });
                                        } else {
                                            document.getElementById("cost").disabled = true;
                                        }

                                    }
                                    function bindBranchDropDown(branchJson) {
                                        $.each(branchJson, function () {
                                            $('#cost').val(branchJson.cost) ;
                                        });
                                    }
</script>
