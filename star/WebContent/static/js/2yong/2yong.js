/*
 * 
 */

/*게시글 목록*/

let page = 1;
let count = 1; //한번만 실행할수있게하는 flag
let loading = false;    //중복실행여부 확인 변수
$(window).ready(next_load());

/*스크롤이벤트*/
$(window).scroll(function() {
   console.log(Math.round($(window).scrollTop()));
   console.log($(document).height() - $(window).height());
   if (Math.round($(window).scrollTop()) >= $(document).height() - $(window).height()) {
      if (!loading)    //실행 가능 상태라면?
      {
         page++;
         loading = true; //실행 불가능 상태로 변경
         next_load();
         return;
      }
   }
});


/*목록생성*/
showList();

function showList() {
   reviews = JSON.parse(reviews);
   const $div = $("#2yong_odd");
   let text = "";

   reviews.forEach(review => {text += `
										<div id="1"
											 style="display: flex; flex-direction: column; vertical-align: top; border-radius: 10px; box-shadow: rgb(235, 235, 235) 0px 2px 12px 0px; align-items: center;">
										<a href="javascript:location.href='${contextPath}/2yong/zasehan2yong.jsp'"
											style="padding-bottom: 38px; display: flex; flex-direction: column;">
											<div
												style="display: flex; padding-top: 32px; justify-content: space-between; width: 417px;">
												<div style="display: flex;">
													<div style="display: flex; position: relative;">
														<img
															src="https://wayo.cdn.ntruss.com/resized/pet/e7c075c8d9bf40f8a106b2b820da54c3.jpg"
															style="width: 50px; height: 50px; border-radius: 50%; object-fit: cover;">
													</div>
													<div
														style="display: flex; flex-direction: column; margin-left: 24px;">
														<h1 id="2yong_jiyeok1"
															style="font-size: 20px; line-height: 23px; color: rgb(57, 60, 71); margin-bottom: 6px; display: flex; align-items: center; letter-spacing: -0.2px; text-align: left;">지역</h1>
														<div style="display: flex; align-items: center;">
															<div
																style="display: flex; flex-direction: column; align-items: flex-end;">
																<p id="2yong_name1">${review.userName}</p>
															</div>
														</div>
													</div>
												</div>
											</div>
											<p id="2yong_hugi1"
												style="font-size: 15px; font-weight: 400; color: rgb(85, 85, 85); width: 343px; margin-top: 18.5px; overflow: hidden; word-break: break-all; white-space: normal; text-align: left; text-overflow: ellipsis; display: -webkit-box; -webkit-line-clamp: 5; -webkit-box-orient: vertical; overflow-wrap: break-word; line-height: 24px; align-self: flex-end;">
												${review.reviewComment}</p>
											<div
												style="margin-top: 28px; background-color: rgb(250, 250, 252); width: 343px; height: 40px; border-radius: 20px; display: flex; flex-direction: row; justify-content: center; align-items: center; align-self: flex-end;">
												<span
													style="font-size: 20px; margin-bottom: 0px; color: rgb(95, 99, 108); margin-right: 3px;">+</span>
												<p
													style="font-weight: 600; color: rgb(95, 99, 108); font-size: 14px; line-height: 40px;">
													내용 더 보기</p>
											</div>
										</a> 
									</div>
									`;


});


   if (resultTwo.length == 0) {
      text += `
				<a
					href="{pageContext.request.contextPath}/templates/2yong/zasehan2yong.jsp"
					style="padding-bottom: 38px; display: flex; flex-direction: column;">
					<div
						style="display: flex; padding-top: 32px; justify-content: space-between; width: 417px;">
						<div style="display: flex;">
							<div style="display: flex; position: relative;">
								<img
									src="https://wayo.cdn.ntruss.com/resized/pet/e7c075c8d9bf40f8a106b2b820da54c3.jpg"
									style="width: 50px; height: 50px; border-radius: 50%; object-fit: cover;">
							</div>
							<div
								style="display: flex; flex-direction: column; margin-left: 24px;">
								<h1 id="2yong_jiyeok1"
									style="font-size: 20px; line-height: 23px; color: rgb(57, 60, 71); margin-bottom: 6px; display: flex; align-items: center; letter-spacing: -0.2px; text-align: left;">지역</h1>
								<div style="display: flex; align-items: center;">
									<div
										style="display: flex; flex-direction: column; align-items: flex-end;">
										<p id="2yong_name1">${user.userName}</p>
									</div>
								</div>
							</div>
						</div>
					</div>
					<p id="2yong_hugi1"
						style="font-size: 15px; font-weight: 400; color: rgb(85, 85, 85); width: 343px; margin-top: 18.5px; overflow: hidden; word-break: break-all; white-space: normal; text-align: left; text-overflow: ellipsis; display: -webkit-box; -webkit-line-clamp: 5; -webkit-box-orient: vertical; overflow-wrap: break-word; line-height: 24px; align-self: flex-end;">
						현재 게시글이 없습니다. 게시글 작성을 해보세요!</p>
					<div
						style="margin-top: 28px; background-color: rgb(250, 250, 252); width: 343px; height: 40px; border-radius: 20px; display: flex; flex-direction: row; justify-content: center; align-items: center; align-self: flex-end;">
						<span
							style="font-size: 20px; margin-bottom: 0px; color: rgb(95, 99, 108); margin-right: 3px;">+</span>
						<p
							style="font-weight: 600; color: rgb(95, 99, 108); font-size: 14px; line-height: 40px;">
							내용 더 보기</p>
					</div>
				</a> 
	`
	}

   $div.append(text);
}


/*버튼눌렀을때 ajax*/


/*동적 태그 변경 감지*/


