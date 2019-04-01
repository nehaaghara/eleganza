<%-- 
    Document   : adminMenu
    Created on : Mar 6, 2019, 10:58:24 AM
    Author     : ITMCS
--%>

<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${pageContext.servletContext.contextPath}/webresource/admin/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p>${sessionScope.sessionuser.first_name}</p>
                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
        </div>
        <!-- search form -->
        <form action="#" method="get" class="sidebar-form">
            <div class="input-group">
                <input type="text" name="q" class="form-control" placeholder="Search...">
                <span class="input-group-btn">
                    <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                    </button>
                </span>
            </div>
        </form>
        <!-- /.search form -->
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu" data-widget="tree">
            <li class="header">MAIN NAVIGATION</li>
            <li class="treeview">
                <a href="${pageContext.servletContext.contextPath}/dashboard">
                    <i class="fa fa-dashboard"></i> <span>Dashboard</span>
                </a>

            </li>
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-laptop"></i> <span>Advertisement Topic</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="${pageContext.servletContext.contextPath}/addAdvertisement"><i class="fa fa-circle-o"></i> Add </a></li>
                    <li><a href="${pageContext.servletContext.contextPath}/viewAdvertisement"><i class="fa fa-circle-o"></i> View </a></li>
                </ul>
            </li>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-laptop"></i> <span>User Interest</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="${pageContext.servletContext.contextPath}/adduserinterest"><i class="fa fa-circle-o"></i> Add </a></li>
                    <li><a href="${pageContext.servletContext.contextPath}/viewuserinterest"><i class="fa fa-circle-o"></i> View </a></li>
                </ul>
            </li>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-laptop"></i> <span>Profile</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="${pageContext.servletContext.contextPath}/profileInformation"><i class="fa fa-circle-o"></i> Change Your Information </a></li>
                    <li><a href="${pageContext.servletContext.contextPath}/changePassword"><i class="fa fa-circle-o"></i>Change Password </a></li>
                </ul>
            </li>

            <!--            <li class="treeview">
                            <a href="#">
                                <i class="fa fa-laptop"></i>
                                <span>Category</span>
                                <span class="pull-right-container">
                                    <i class="fa fa-angle-left pull-right"></i>
                                </span>
                            </a>
                            <ul class="treeview-menu">
                                <li><a href="${pageContext.servletContext.contextPath}/addcategory"><i class="fa fa-circle-o"></i> Add Category</a></li>
                                <li><a href="${pageContext.servletContext.contextPath}/viewcategory"><i class="fa fa-circle-o"></i> View Category</a></li>
            
                            </ul>
                        </li>
                        <li class="treeview">
                            <a href="#">
                                <i class="fa fa-laptop"></i>
                                <span>Brand</span>
                                <span class="pull-right-container">
                                    <i class="fa fa-angle-left pull-right"></i>
                                </span>
                            </a>
                            <ul class="treeview-menu">
                                <li><a href="${pageContext.servletContext.contextPath}/addadminbrand"><i class="fa fa-circle-o"></i> Add Brand</a></li>
                                <li><a href="${pageContext.servletContext.contextPath}/viewadminbrand"><i class="fa fa-circle-o"></i> View Brand</a></li>
            
                            </ul>
                        </li>
                        <li class="treeview">
                            <a href="#">
                                <i class="fa fa-laptop"></i>
                                <span>Product</span>
                                <span class="pull-right-container">
                                    <i class="fa fa-angle-left pull-right"></i>
                                </span>
                            </a>
                            <ul class="treeview-menu">
                                <li><a href="${pageContext.servletContext.contextPath}/addproduct"><i class="fa fa-circle-o"></i> Add Product</a></li>
                                <li><a href="${pageContext.servletContext.contextPath}/viewproduct"><i class="fa fa-circle-o"></i>View Product</a></li>
            
                            </ul>-->
        </ul>
    </section>
</aside> 




