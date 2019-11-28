<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>添加订单</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>
<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	/* function add() {
		
		var itm = document.getElementById("table1").lastChild;
		var cln = itm.cloneNode(true);
		var num=$("input[name='peopleCount']").val();
		num++;
		$("input[name='peopleCount']").attr("value" ,num);
		document.getElementById("table1").appendChild(cln);
	} */
	
	/* function min() {
		
		var itm = document.getElementById("table1").lastChild;
		var cln = itm.hide(true);
		var num=$("input[name='peopleCount']").val();
		num--;
		$("input[name='peopleCount']").attr("value" ,num);
		document.getElementById("table1").appendChild(cln); 
	}*/
	
	
	 function addRow() {
	    var node=$("#passengerInfo").clone(true);
	    var PeopleCount=$("[name='peopleCount']");
	    var numPeople=PeopleCount.val();	
		$("#passengerInfo").after(node);
		$("#name").attr("name","passengerList["+numPeople+"].name")
		$("#sex").attr("name","passengerList["+numPeople+"].sex")
		$("#phoneNum").attr("name","passengerList["+numPeople+"].phoneNum")
		$("#credentialsType").attr("name","passengerList["+numPeople+"].credentialsType")
		$("#credentialsNum").attr("name","passengerList["+numPeople+"].credentialsNum")
		$("#travellerType").attr("name","passengerList["+numPeople+"].travellerType")	
		
		numPeople++;
		PeopleCount.attr("value",numPeople);
		} 
	


	
</script>
</HEAD>
<BODY>
	<FORM id=form1 name=form1
		action="${pageContext.request.contextPath }/order/addOrder.action"
		method=post>
		

		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></TD>
					<TD width="100%" background="${pageContext.request.contextPath }/images/new_020.jpg"
						height=20></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_022.jpg"><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#fffffe>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：订单管理 &gt; 添加订单</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						
						<TABLE cellSpacing=0 cellPadding=5  border=0>
						  
						    
							<TR>
								<td>订单编号：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="orderNum">
								</td>
								<td>选择产品 ：</td>
								<td>
								<!-- <INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="productId" > -->
														
								    <select name="productId" style="WIDTH: 180px" maxLength=50>
								        <c:forEach items="${prolist }" var="p">								        							        
										<option value="${p.id }">${p.productName }</option>
										</c:forEach>
									</select>
								</td>
							</TR>
							
							<TR>
								
								<td>出行人数 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="peopleCount" value="1" readonly="readonly">
								</td>
								<td>支付方式：</td>
								<td>
								<select name="payType" style="WIDTH: 180px" maxLength=50>
								        							        							        
										<option value="1">现金</option>
										<option value="2">支付宝</option>
										<option value="3">微信</option>
									</select>
								</td>
							</TR>
							
							<TR>
								
								
								<td>订单状态：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="orderStatus" >
								</td>
								<td>选择会员 ：</td>
								<td>
								<!-- <INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="memberId"> -->
									 <select name="memberId" style="WIDTH: 180px" maxLength=50>
									 <c:forEach items="${mmlist }" var="m">
										<option value="${m.id }">${m.name }</option>
									</c:forEach>
									</select> 
								</td>
							</TR>
							
							<TR>
								
								
								<td>其他信息 ：</td>
								<td colspan="2">
									<textarea rows="3" style="WIDTH: 180px" cols="1" maxLength=50 name="orderDesc" ></textarea>
								</td>
							</TR>
							
						</TABLE>
						
						
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
					<IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		
		
		
		
		
		
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_022.jpg"><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#fffffe>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>添加游客</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						
						<TABLE cellSpacing=0 cellPadding=5  border=0 id="passengerInfo">
						  
						    
							<TR>
								<td>游客姓名：</td>
								<td>
								<INPUT class=textbox id=name
														style="WIDTH: 180px" maxLength=50 name="passengerList[0].name">
								</td>
								<td>性别 ：</td>
								<td>
								<!-- <INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="productId" > -->
														
								    <select name="passengerList[0].sex" id=sex style="WIDTH: 180px" maxLength=50>
								        							        							        
										<option value="1">男</option>
										<option value="2">女</option>
									</select>
								</td>
							</TR>
							
							<TR>
								
								<td>电话 ：</td>
								<td>
								<INPUT class=textbox id=phoneNum
														style="WIDTH: 180px" maxLength=50 name="passengerList[0].phoneNum" >
								</td>
								<td>身份类型：</td>
								<td> 
								    <select name="passengerList[0].credentialsType" id=credentialsType style="WIDTH: 180px" maxLength=50>
								        							        							        
										<option value="1">身份证</option>
										<option value="2">国外身份证</option>
									</select>
								</td>
							</TR>
							
							<TR>
								
								
								<td>证件号：</td>
								<td>
								<INPUT class=textbox id=credentialsNum
														style="WIDTH: 180px" maxLength=50 name="passengerList[0].credentialsNum" >
								</td>
								<td>旅行类型 ：</td>
								<td>
								<INPUT class=textbox id=travellerType
														style="WIDTH: 180px" maxLength=50 name="passengerList[0].travellerType"> 
									 
								</td>
							</TR>	
							<TR>
								<TD height=2></TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>						
							
						</TABLE>
				<table>
						<TR>			
							<tr>
								<td rowspan=2>
								<INPUT class=button id=sButton2 type=submit
														value=" 保存 " name=sButton2>
							    <INPUT class=button id=sButton2 type=button
														value=" 添加 游客" name=sButton2 onclick="addRow()">
								
								
								 <INPUT class=button id=sButton2 type=button
														value=" 取消游客" name=sButton2 onclick="min()">
								</td>
							</tr>
						
				</table>
						
						
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
					<IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></TD>
					<TD align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	</FORM>
	
	
	
	
</BODY>
</HTML>
