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
             Package
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
                        <h3 class="box-title">Add Package</h3>
                    </div>
                    <form:form action="${pageContext.servletContext.contextPath}/saveAdminPackage" modelAttribute="adminPackageServiceBean" method="post">
                        <form:hidden path="tblPackage.package_Id" name="tblPackage.package_Id" />
                        <div class="box-body">
                            <div class="form-group">
                                <label for="serviceName">Creation Date </label>
                                <form:input type="date" path="tblPackage.creationDate" class="form-control form-filter input-sm" name="tblPackage.creationDate" placeholder="" />        
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="form-group">
                                <label for="description">Expiry Date</label>
                                <form:input type="date" path="tblPackage.expiryDate" placeholder="" class="form-control form-filter input-sm" name="tblPackage.expiryDate" />
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="form-group">
                                <label for="charges">Description</label>
                                <form:textarea  path="tblPackage.description" class="form-control form-filter input-sm" name="tblPackage.description"/>
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="form-group">
                                <label for="charges">Cost</label>
                                <form:input path="tblPackage.cost" name="tblPackage.cost" type="text" class="form-control"/>
                            </div>
                        </div>
                         <div class="panel-body" id="dvserviceIds"> 
                                <c:if test="${not empty lstPackageServices}">
                                    <div id="services" value="${fn:length(lstPackageServices)}"></div> 
                                    <c:forEach items="${lstPackageServices}" var='idEntry' varStatus='loop'>
                                        <div class="row" id="dvserviceIds${loop.index+1}" style="margin: -12px -15px;">
                                            <div class="col-md-10">
                                                <div class="form-group">
                                                    <label for="serviceFK">Select Service</label>
                                                    <form:select path="services[${loop.index}]" title="Service" name="services[${loop.index}]" id="serviceFk${loop.index+1}" onchange="DrpServiceChange(this);" class="form-control select2" style="width: 100%;">
                                                        <option value="-1" disabled="true" selected="true">Please Select</option>
                                                        <c:forEach items='${lstAdminServices}' var='entry'>
                                                            <c:if test="${entry.service_Id eq idEntry.serviceFk.service_Id}">
                                                                <option value="${entry.service_Id}" selected="true">${entry.serviceName}</option> 
                                                            </c:if>
                                                            <c:if test="${entry.service_Id ne idEntry.serviceFk.service_Id}">
                                                                <option value="${entry.service_Id}">${entry.serviceName}</option> 
                                                            </c:if>
                                                        </c:forEach>  
                                                    </form:select>
                                                    <span for="services[${loop.index}]" class="help-block"><form:errors path="services[${loop.index}]"/></span>
                                                </div>
                                            </div>
                                            <div class="col-md-1">
                                                <div class="form-group">
                                                    <br>
                                                    <c:choose>
                                                        <c:when test="${loop.index == 0 }">
                                                            <button type="button" class="btn btn-primary" onclick="fnAddServiceRow();">Add</button>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <button type="button" class="btn btn-primary" onclick="fnDeleteService(${loop.index+1})"><i class="fa fa-close"></i></button>
                                                            </c:otherwise>
                                                        </c:choose>
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${empty lstPackageServices}">
                                    <div class="row" id="dvserviceIds1" style="margin: -12px -15px;">    
                                        <div class="col-md-10">
                                            <div class="form-group">
                                                <label for="serviceFK">Select Service</label>
                                                <form:select path="services[0]" title="Service" name="services[0]" id="serviceFk1" class="form-control select2" onchange="DrpServiceChange(this);" style="width: 100%;">
                                                    <option value="-1" disabled="true" selected="true">Please Select</option>
                                                    <c:forEach items='${lstAdminServices}' var='entry'>
                                                        <option value="${entry.service_Id}">${entry.serviceName}</option> 
                                                    </c:forEach>  
                                                </form:select>
                                                <span for="services[0]" class="help-block"><form:errors path="services[0]"/></span>
                                            </div>
                                        </div>
                                        <div class="col-md-1">
                                            <div class="form-group">
                                                <br>
                                                <button type="button" class="btn btn-primary" onclick="fnAddServiceRow();">Add</button>
                                            </div>
                                        </div>
                                    </div>
                                </c:if>
                            </div>
                        <!-- /.box-body -->
                        <div class="box-footer">
                            <input type="submit" name="save" value="Save & Exit" class="btn btn-primary"/>
                            <input type="submit" name="saveAndNew" value="Save & New" class="btn btn-primary"/>
                            <input type="button" name="action" value="Cancel" class="btn btn-primary" onclick="window.location.href = '${pageContext.servletContext.contextPath}/viewAdminPackage'"/>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
</div>
</div>
<!-- /.content-wrapper -->
<script src="${pageContext.servletContext.contextPath}/webresource/js/userJs/AdminServiceJs.js"></script>

