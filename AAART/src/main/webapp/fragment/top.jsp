<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/eDM.css" type="text/css" />

<script src="${pageContext.request.contextPath}/javascript/jquery-1.9.1.js"></script>
<script src="${pageContext.request.contextPath}/javascript/eDM.js"></script>

<c:set var='debug' value='true' scope='application' />
<table class='menuOuter'>
  <tr height="48px">
    <td width="60px" rowspan='2'>
<!--     <img width="60px" height="40px" -->
<%--       src="${pageContext.request.contextPath}/images/BookStore.gif"> --%>
      
<!--     <img width="60px" height="40px" -->
<%--       src="<c:url value='/images/BookStore.gif'  />">   --%>
      
    </td>
    <td>
      <table class='menuInner' > 
        <tr>
          <td class='menuData'>
            <div class='menu'>
			  <c:if test="${empty LoginOK}">
				<a href="<c:url value='/_35_login/login.jsp' />">
				     登入 
				</a>
              </c:if>
			</div>
		  </td>
		  <td class='menuData'>
			<div class='menu'>
			   <c:if test="${ funcName != 'SHO' }">
                  <a href="<c:url value='/_35_listActs/chooseCategory.jsp' />" >
				        預約 
				  </a>
			   </c:if>
			   <c:if test="${ funcName == 'SHO' }"> 
                                                 預約
               </c:if>
			</div>
		  </td>
		  <td class='menuData'>
			<div class='menu'>
			  <c:if test="${ funcName != 'CHE' }">
			     <a href="<c:url value='/_35_ShoppingCart/ShowCartContent.jsp' />">
				     下訂 
				 </a>
			  </c:if>
			  <c:if test="${ funcName == 'CHE' }"> 
                                               下訂
              </c:if>
			</div>
		  </td>
		  <td class='menuData'>
			<div class='menu'>
			  <c:if test="${ funcName != 'ORD' }">
				 <a href="<c:url value='/_35_orderProcess/orderList.do' />">
				     訂單 
			     </a>
			  </c:if>
			  <c:if test="${ funcName == 'ORD' }"> 
                                                訂單
              </c:if>
			</div>
		  </td>
		  <td class='menuData'>
			<div class='menu'>
		      <c:if test="${ funcName != 'BMT' }">
				<a href="<c:url value='/_35_productMaintain/DisplayActs' />">
                                             維護
                </a>
              </c:if>
			  <c:if test="${ funcName == 'BMT' }"> 
                                             維護
              </c:if>
			</div>
		  </td>
		  <td class='menuData'>
			<div class='menu'>
		       &nbsp;
			</div>
		  </td>
          
		  <td class='menuData'>
		  <div class='menu'>
			<c:if test="${ funcName != 'REG' }">
			   <a href="<c:url value='/_35_register/register.jsp' />"> 註冊 </a>
			</c:if> 
			<c:if test="${ funcName == 'REG' }"> 
                                                     註冊
            </c:if>
            </div>
          </td>
		  <td class='menuData'>
		  <div class='menu' style='width:50px;'>
			<c:if test="${ funcName != 'IND' }">
			   <a href="<c:url value='/index.jsp' />"> 回首頁 </a>
			</c:if>
			</div>
		  </td>
		  
		  <td class='menuData'>
		  <div class='menu'>
			<c:if test="${ ! empty LoginOK }">
			   <a href="<c:url value='/_35_login/logout.jsp' />">
  				登出 
	           </a>
			</c:if>
			</div>
		  </td>
		</tr>
		<tr height='20px'>
			<td width='300px' colspan='9'><small>${pageContext.session.id }</small>
			</td>
		</tr>
	  </table>
	<tr>
      <td>
	  <hr style="color: #f00; background-color: #f00; height: 2px;">
	  </td>
	</tr>
</table>