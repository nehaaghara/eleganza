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
            User Interest
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
                        <h3 class="box-title">Add  Your Interest </h3>
                    </div>
                    <form:form action="${pageContext.servletContext.contextPath}/saveUserInterest" modelAttribute="tblUserInterest" method="post">
                        <form:hidden path="topic_Id" name="topic_Id" />
                        <div class="box-body">
                            <div class="form-group">
                                <label for="userId">Enter Your User Name</label>
                                <form:input path="userId.userId" name="title" class="form-control" id="userId.userId" title="userId"  placeholder="Enter Advertisement Topic" autofocus="on"/>
                            </div>
                        </div>
                        <div class="box-body">
                            <div class="form-group">
                                <label for="Title">Select Your Interested Topic</label>
                                <form:select path="topic_Id.topic_Id" title="topic_Id" name="topic_Id.topic_Id" id="topic_Id" class="form-control select2" style="width: 100%;">
                                    <option value="-1" disabled="true" selected="true">Please Select</option>
                                    <c:forEach items='${lstInstitute}' var='entry'>
                                        <c:if test="${entry.institutePk ne tblInstituteBranch.instituteFk.institutePk}">
                                            <option value="${entry.institutePk}">${entry.instituteName}</option> 
                                        </c:if>
                                        <c:if test="${entry.institutePk eq tblInstituteBranch.instituteFk.institutePk}">
                                            <option value="${entry.institutePk}" selected="true">${entry.instituteName}</option> 
                                        </c:if>
                                    </c:forEach>  
                                </form:select>
                            </div>
                        </div>
                        <!-- /.box-body -->
                        <div class="box-footer">
                            <input type="submit" name="save" value="Save & Exit" class="btn btn-primary"/>
                            <input type="submit" name="saveAndNew" value="Save & New" class="btn btn-primary"/>
                            <input type="button" name="action" value="Cancel" class="btn btn-primary" onclick="window.location.href = '${pageContext.servletContext.contextPath}/viewAdvertisement'"/>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
</div>
</div>
<!-- /.content-wrapper -->


