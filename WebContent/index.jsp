<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en" class="no-js">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
		<title>Niec CollegeDesk</title>

		<link rel="shortcut icon" href="../favicon.ico">
		<link rel="stylesheet" type="text/css" href="css/default.css" />
		<link rel="stylesheet" type="text/css" href="css/component.css" />
		<script src="js/modernizr.custom.js"></script>
        <link rel="stylesheet" type="text/css"  href="css/style.css"/>
	</head>
	<body>
		<div class="container">
            <img src="images/logo.png" id="logo">
			<header class="clearfix">

				<span>NIEC UNIVERSITY</span>
				<h1>College Help Desk</h1>

			</header>	
			<div class="main">
				<nav id="cbp-hrmenu" class="cbp-hrmenu">
					<ul>
                        <li>
                            <a href="#" >Home</a>

						<li>
							<a href="#">Explore NIEC</a>
							<div class="cbp-hrsub">
								<div class="cbp-hrsub-inner">
                                    <div class="in" >
                                        <h4>History</h4>
                                        <ul>
                                            <li><a href="BBDGEI.html">BBDGEI Group Profile </a></li>
                                            <li><a href="banarsi.html">Late Babu Banarsi Das Ji</a></li>
                                            <li><a href="akhileshDasGupta.html">Dr. Akhilesh Das Gupta</a></li>
                                            <li><a href="alka.html">Ms. Alka Das Gupta</a></li>


                                        </ul>
                                    </div>
									<div class="in" >
										<h4>Brief</h4>
										<ul>
											<li><a href="mission.html">Mission</a></li>

											<li><a href="message.html">Message from DIrector</a></li>

										</ul>
									</div>

									<div class="in" >
										<h4>Team</h4>
										<ul>
											<li><a href="#">Parth Kaushik</a></li>
											<li><a href="#">Kanika Murarka</a></li>
											<li><a href="#">Shivam Aggarwal</a></li>
                                            <li><a href="#">Kanika Rungta</a></li>
                                            <li><a href="#">Sandeep Rana</a></li>
										</ul>

									</div>
								</div><!-- /cbp-hrsub-inner -->
							</div><!-- /cbp-hrsub -->
						</li>

						<li>
							<a href="#">Photo Gallery</a>
							<div class="cbp-hrsub">
								<div class="cbp-hrsub-inner">
                                    <div class="in">
                                        <h4>2015</h4>
                                        <ul>
                                            <li><a href="#">A look at NIEC</a></li>
                                            <li><a href="#">Innoviz</a></li>
                                            <li><a href="#">Sports Meet</a></li>
                                        </ul>

                                    </div>
									<div class="in">
										<h4>2014</h4>
										<ul>
											<li><a href="#">Fnord</a></li>
											<li><a href="#">Sports Meet</a></li>
										</ul>

									</div>


								</div><!-- /cbp-hrsub-inner -->
							</div><!-- /cbp-hrsub -->
						</li>
						<li>
							<a href="#">Register/Login</a>
							<div class="cbp-hrsub">
								<div class="cbp-hrsub-inner"> 
									<div >
										<h4>Guest Register</h4>
										<form action="sendMail" method="post">
                                            <input type="text" name="name" placeholder="Enter a Username" required="required"/>
                                            <input type="password" name="pass" placeholder="Enter a password" required="required"/>
                                            <input type="email" name="email" placeholder="Enter your Email-id" required="required"/>
                                            <br>
                                            <input type="submit" value="Register"/>
                                        </form>

									</div>
									<div >
										<h4>Login</h4>
                                        <form action="decide" method="post">
                                            <input type="text" name="user" placeholder="Enter the Username" required="required"/>
                                            <input type="password" name="pass" placeholder="Enter the password" required="required"/><br>
                                            <input type="radio" name="category" value="Teacher" checked="checked" />Teacher
                                            <input type="radio" name="category" value="Student"  />Student
                                            <input type="radio" name="category" value="Guest"  />Guest
                                            <br>
                                            <input type="submit" value="Login"/>
                                        </form>
									</div>
									<div >
										<h4><a href="adminLogin.jsp" title="For Admin login">Admin Login</a></h4>
                                        
									</div>
								</div><!-- /cbp-hrsub-inner -->
							</div><!-- /cbp-hrsub -->
						</li>
						<li>
							<a href="#">Contact Us</a>
							<div class="cbp-hrsub">
								<div class="cbp-hrsub-inner"> 
									<div class="in">
										<h4>Address</h4>
										<p>NORTHERN INDIA ENGINEERING COLLEGE<br>
                                        FC-26, SHASTRI PARK<br>
                                        NEW DELHI- 110053
                                        </p>

									</div>
									<div class="in">
										<h4><Reach> Telephone </Reach></h4>
										<ul>
											<li>91+9868179156</li>
											<li><b>Fax: </b>011-22009150</li>
                                            <li><b>Email: </b>abc@gmail.com</li>
                                            <li><b>Website: </b><a href="http://localhost:63342/CollegeHelpDesk/index.html"> www.NiecCollegeHelpDesk.com</a></li>

										</ul>
									</div>
									<div class="in">
										<h4>Reach Us</h4>
                                            <a href="https://www.google.co.in/maps/search/sharp+near+Northern+India+Engineering+College,+Shahdara,+New+Delhi,+Delhi/@28.6851793,77.2712813,14z"
                                               ><img src="images/location.png">Click me </a>
									</div>
								</div><!-- /cbp-hrsub-inner -->
							</div><!-- /cbp-hrsub -->
						</li>
					</ul>
				</nav>
			</div>
		</div>

		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
		<script src="js/cbpHorizontalMenu.min.js"></script>
		<script>
			$(function() {
				cbpHorizontalMenu.init();
			});
		</script>
    <div id ="red">
        <div id="search">
            <form action="staticConverter" method="post">
                <div id="text"> <input type="search" placeholder="Type your query here..." name="que" class="black"></div>
                <div id="button"><input type="submit" value="Search"></div>

            </form>
        </div>
        <img src="images/b5.png">

    </div>
    <div id="a">
        <div id="a1">
        <table>
            <thead><u>ACCREDITATIONS & AFFILIATIONS</u></thead>
            <tr>
                <td><img src="images/aicte.png" class="a1"> </td>
                <td>Approved by: AICTE</td>
            </tr>
            <tr>
                <td><img src="images/nba.jpg" class="a1"> </td>
                <td>Accreditated by: NBA</td>
            </tr>
            <tr>
                <td><img src="images/ipu.gif" class="a1"> </td>
                <td>Affiliated to: GGSIPU, Delhi</td>
            </tr>
            <tr>
                <td><img src="images/iso.png" class="a1"> </td>
                <td>ISO 9001:2008 Certified</td>
            </tr>
            <tr>
                <td><img src="images/iso.png" class="a1"> </td>
                <td>EN ISO 14001:2004 Certified</td>
            </tr>



        </table>
        </div>

        <div id="ad">
            Group Highlights
            <img src="images/lightblue2.gif">
            <img src="images/lightgreen2.gif">
        </div>

    </div>

        <div id="b">
            <div id="b1">
                <blockquote>"Education is the best friend. An educated person is respected everywhere. Education beats the beauty and the youth."
                   <i> Chanakya</i>
                </blockquote>
            </div>
        </div>
    <div id="c">

        <ul><span id="notice">Notices & Accouncements</span>
            <li><a href="http://www.niecdelhi.ac.in/students/noticeboard/Summer%20Training%20Notice.pdf">
                Summer Training Notice</a></li>
            <li><a href="http://www.niecdelhi.ac.in/students/noticeboard/General%20Instruction%20for%20Summer%20Training%202015.pdf" >
                General Instruction for Summer Training 2015</a></li>
            <li><a href="http://www.niecdelhi.ac.in/students/noticeboard/Summer%20Training%202015%20SLOTS%20details%20-%20all%20branches.pdf" >
                All Branches Summer Training 2015 Slots Details</a></li>
            <li><a href="http://www.niecdelhi.ac.in/students/noticeboard/Summer%20Training%202015%20Schedule_EEE_Final.pdf" >
                Summer Training 2015 Schedule EEE</a></li>
            <li><a href="http://www.niecdelhi.ac.in/students/noticeboard/Summer%20Training%202015%20Schedule_EEE_Final.pdf">
                Summer Training 2015 Schedule CIVIL</a></li>
            <li><a href="http://www.niecdelhi.ac.in/students/noticeboard/Summer%20Training%202015%20Schedule_EEE_Final.pdf"
                    >Summer Training 2015 Schedule CSE</a></li>
            <li><a href="http://www.niecdelhi.ac.in/students/noticeboard/Summer%20Training%202015%20Schedule_EEE_Final.pdf"
                    >Summer Training 2015 Schedule ECE</a></li>
            <li><a href="http://www.niecdelhi.ac.in/students/noticeboard/Summer%20Training%202015%20Schedule_EEE_Final.pdf"
                    >Summer Training 2015 Schedule IT</a></li>
            <li><a href="http://www.niecdelhi.ac.in/students/noticeboard/Summer%20Training%202015%20Schedule_EEE_Final.pdf"
                    >Summer Training 2015 Schedule MAE</a></li>
            <li><a href="http://www.niecdelhi.ac.in/students/noticeboard/Summer%20Training%202015%20Schedule_EEE_Final.pdf"
                    >Important Notice regarding Online Counselling 2015-16</a></li>
            <li><a href="http://www.niecdelhi.ac.in/students/noticeboard/Summer%20Training%202015%20Schedule_EEE_Final.pdf"
                    >"Indian Navy Notification for B. Tech-2014 Passed Out Batch"</a></li>
            <li><a href="http://www.niecdelhi.ac.in/students/noticeboard/Summer%20Training%202015%20Schedule_EEE_Final.pdf"
                    >Office Order</a></li>

        </ul>
    </div>
<footer>
    <img src="images/logo.png" >
    <div id="footer_text">NIEC UNIVERSITY</div>
    <div id="outer"></div>
    <div id="inner"></div>





</footer>
        <div id="popup-box1" class="popup-position">
            <div id="popup-wrapper">
                <p style="text-align: right;"><a href="javascript:void(0)" onclick="toggle_visibility('popup-box1');">X</a></p>
                <div id="popup-container">
                    <h3>Website Feedback</h3>
                    <form action="guestFeed" method="get" id="feedback_form">
                        <label>
                            Name:
                            <input type="text" name="name">

                        </label><br>
                        <label>
                            Email:
                            <input type="email" name="email">

                        </label><br>
                        <label id="ta">
                          <span> Feedback:</span>
                            <textarea name="feed">

                            </textarea>

                        </label><br>
                        <input type="submit" value="Submit">
                        <input type="reset" value="Reset">
                    </form>
                </div><!-- Popup container end -->

            </div><!-- Popup wrapper popup end -->
        </div><!-- Popup box 1 end -->



        <div id="wrapper">

            <p><a href="javascript:void(0)" onclick="toggle_visibility('popup-box1');">Website Feedback</a></p>


        </div><!-- Wrapper end -->
        <script type="text/javascript">

            function toggle_visibility(id) {
                var e = document.getElementById(id);
                if(e.style.display == 'block')
                    e.style.display = 'none';
                else
                    e.style.display = 'block';
            }

        </script>
		
		
	</body>
</html>

</html>