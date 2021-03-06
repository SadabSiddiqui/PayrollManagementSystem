<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<!--[if IE 9]> <html class="no-js ie9 fixed-layout" lang="en"> <![endif]-->
<!--[if gt IE 9]><!--> <html class="no-js " lang="en"> <!--<![endif]-->
<head>

    <!-- Basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    <!-- Mobile Meta -->
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    
    <!-- Site Meta -->
    <title>Genius</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <!-- Site Icons -->
    <link rel="shortcut icon" href="genius/images/favicon.ico" type="image/x-icon" />
    <link rel="apple-touch-icon" href="genius/images/apple-touch-icon.png">

	<!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet"> 
    <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700" rel="stylesheet"> 

	<!-- Custom & Default Styles -->
	<link rel="stylesheet" href="genius/css/bootstrap.min.css">
    <link rel="stylesheet" href="genius/css/font-awesome.min.css">
    <link rel="stylesheet" href="genius/css/carousel.css">
    <link rel="stylesheet" href="genius/style.css">

	<!--[if lt IE 9]>
		<script src="js/vendor/html5shiv.min.js"></script>
		<script src="js/vendor/respond.min.js"></script>
	<![endif]-->

</head>
<body class="left-menu">  
 


    
    <div class="menu-wrapper">
        <div class="mobile-menu">
            <nav class="navbar navbar-inverse">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="index2.html"><img src="genius/images/logo-normal.png" alt=""></a>
                    </div>
                    <div id="navbar" class="navbar-collapse collapse">
                        <ul class="nav navbar-nav">
                          
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Home <span class="fa fa-angle-down"></span></a>
                               
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Pages <span class="fa fa-angle-down"></span></a>
                               
                            <li><a href="#">Contact</a></li>
                        </ul>
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="https://html.design">Download <i class="fa fa-shopping-bag"></i></a></li>
                        </ul>
                    </div><!--/.nav-collapse -->
                </div><!--/.container-fluid -->
            </nav>
        </div><!-- end mobile-menu -->

        <header class="vertical-header">
            <div class="vertical-header-wrapper">
                <nav class="nav-menu">
                    <div class="logo">
                        <a href="index2.html"><img src="genius/images/logo.png" alt=""></a>
                    </div><!-- end logo -->

                    <div class="margin-block"></div>
                    <ul class="primary-menu">
                        <li class="child-menu"><a href="Emp_Add.jsp">Add Employee<i class="fa fa-angle-right"></i></a>
                           	
                        </li>
                        <li class="child-menu"><a href="Emp_found.jsp">Salary<i class="fa fa-angle-right"></i></a>
                            
                        </li>
                        <li class="child-menu"><a href="index.html">Home<i class="fa fa-angle-right"></i></a>
                        </li>
                        <li class="child-menu"><a href="EmployeeServlet?action=logout">Logout<i class="fa fa-angle-right" ></i></a></li>
		
                    </ul>
            </nav><!-- end nav-menu -->
            </div><!-- end vertical-header-wrapper -->
        </header><!-- end header -->
    </div><!-- end menu-wrapper -->

    <div id="wrapper">

        <div id="home" class="video-section js-height-full">
            <div class="overlay"></div>
            <div class="home-text-wrapper relative container">
                <div class="home-message">
                    <img src="genius/images/biglogo.png" alt="">
                    <p>Payroll System</p>
                    <div class="btn-wrapper">
                    </div><!-- end row -->
                </div>
            </div>
        </div>
    <!-- jQuery Files -->
    <script src="genius/js/jquery.min.js"></script>
    <script src="genius/js/bootstrap.min.js"></script>
    <script src="genius/js/carousel.js"></script>
    <script src="genius/js/parallax.js"></script>
    <script src="genius/js/rotate.js"></script>
    <script src="genius/js/custom.js"></script>
    <script src="genius/js/masonry.js"></script>
    <script src="genius/js/masonry-4-col.js"></script>
    <!-- VIDEO BG PLUGINS -->
    <script src="genius/videos/libs/swfobject.js"></script> 
    <script src="genius/videos/libs/modernizr.video.js"></script> 
    <script src="genius/videos/libs/video_background.js"></script> 
    <script>
        jQuery(document).ready(function($) {
            var Video_back = new video_background($("#home"), { 
                "position": "absolute", //Follow page scroll
                "z-index": "-1",        //Behind everything
                "loop": true,           //Loop when it reaches the end
                "autoplay": true,       //Autoplay at start
                "muted": true,          //Muted at start
                "mp4":"genius/videos/video.mp4" ,     //Path to video mp4 formats
                "video_ratio": 1.7778,              // width/height -> If none provided sizing of the video is set to adjust
                "fallback_image": "genius/images/dummy.png",   //Fallback image path
                "priority": "html5"             //Priority for html5 (if set to flash and tested locally will give a flash security error)
            });
        });
    </script>

</body>
</html>