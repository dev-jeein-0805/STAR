<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/2yong/2yong.css">
<title>Insert title here</title>
</head>

<body class="vsc-initialized" style="margin: 0px">


<header id="menu">
	<section>
		<div>
			<img
				style="width: 150px; height: 150px; margin-left: -90px; margin-top: -33px;"
				src="../../static/image/3.png">
		</div>
		<h1>
			<a href="" id="bannertext">Save The Animal Relationship</a>
		</h1>
		<ul class="gnb_pc">
			<li><a class="bannertext" href="">내주변</a></li>
			<li><a class="bannertext" href="">예약내역</a></li>
			<li><a class="bannertext" href="">더보기</a></li>
			<li><a class="bannertext" href="">로그인</a></li>
		</ul>
	</section>
</header>

<div class="sub_top_wrap">
	<div class="sub_top bg_kong_2">
		<h2>STAR 후기</h2>
	</div>
</div>
<div id="__next">
	<div>
		<div class="wrapper">
			<div id="insurance-container">
				<div class="desktop hidden-s">
					<section class="content-section">
						<div style="margin: 0px auto; width: 1000px">
							<div
								style="font-size: 23px; color: rgb(85, 85, 85); font-weight: 600; margin-bottom: 80px;">
							</div>
						</div>

						<div style="display: block; text-align: center;">
							<div id="review-list-desktop" class="my-masonry-grid">

								<!-- 왼쪽 -->
								<div id="2yong_odd" class="my-masonry-grid_column"
									style="width: 50%;"></div>


								<!-- 오른쪽 -->
								<div id="2yong_even" class="my-masonry-grid_column"
									style="width: 50%;"></div>

							</div>
						</div>
					</section>
				</div>
			</div>
		</div>
	</div>
</div>
<footer>
	<div class="align">
		<ul class="link">
			<li><a href="">서비스문의</a></li>
		</ul>
		<p>
			<b>고객행복센터 1670-6250</b><span>오전 9시 - 새벽 3시</span>
		</p>
		<address>
			<span>(주) STAR</span> 주소 : 서울특별시 강남구 봉은사로 479, 479타워 11층 | 대표이사 :
			정명훈 | 사업자등록번호: 742-86-00224 | 전자우편주소 : help@goodchoice.kr<br>
			통신판매번호 : 2017-서울강남-01779 | 관광사업자 등록번호: 제1026-24호 | 전화번호 : 1670-6250
			| 호스팅서비스제공자의 상호 표시: (주)여기어때컴퍼니<br> <span class="order">(주)
				여기어때컴퍼니는 통신판매중개자로서 통신판매의 당사자가 아니며, 상품의 예약, 이용 및 환불 등과 관련한 의무와 책임은 각
				판매자에게 있습니다.</span><br> Copyright GC COMPANY Corp. All rights
			reserved.
		</address>
	</div>
</footer>

<script>
const menu = document.querySelector('#menu');
const bannertext = document.querySelector('#bannertext');
const banner = document.querySelectorAll('.bannertext');
const menuHeight = menu.getBoundingClientRect().height;

document.addEventListener('scroll', () => {

  if (window.scrollY > menuHeight) {
    menu.classList.add('active');
    bannertext.classList.add('textactive2');
    for(let i=0; i<banner.length; i++){
        banner[i].classList.add('textactive');
    }
  } else {
    menu.classList.remove('active');
    bannertext.classList.remove('textactive2');
    for(let i=0; i<banner.length; i++){
        banner[i].classList.remove('textactive');
    }
  }

});
</script>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
	let reviews = `${reviews}`;
	let contextPath = `${pageContext.request.contextPath}`;
</script>
<script src="${pageContext.request.contextPath}/static/js/2yong/2yong.js"></script>
</body>
</html>