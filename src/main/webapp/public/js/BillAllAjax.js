/**
 * 
 */


function ajaxLoad(id){
	var pageNum=$("#pageNum").val()==""||$("#pageNum").val()==undefined?1:$("#pageNum").val();
	var proName=$("#proName").val()==""||$("#proName").val()==undefined?null:$("#proName").val();
	var isPayment=$("#isPayment").val()==""||$("#isPayment").val()==undefined?null:$("#isPayment").val();
	var proId=$("#proId").val()==""||$("#proId").val()==undefined?0:$("#proId").val();
	var uid=id==""||id==undefined?0:id;
	console.info(uid);
	if(uid>0){
		if(confirm("确认删除？")){
			console.info(uid);
		}else{
			uid=0;
		}
	}
	
	$.ajax({
		url:"../bill/to_bill_all_list",
		type:"post",
		data:{pageNum:pageNum,proName:proName,isPayment:isPayment,proId:proId,id:uid},
		success:function(result){
			$("#billList").html(result);
			
			var pages=$("#pages").val()==""||$("#pages").val()==undefined?1:$("#pages").val();
			console.info(pages);
			
			laypage({
			    cont: 'page' //绑定到指定id
			    ,pages: pages
			    ,curr:pageNum
			    ,jump: function(obj, first){
			      if(!first){
			    	  $("#pageNum").val(obj.curr);
			    	  ajaxLoad();
			      }
			    }
			  });
		}
	});  
	
	
}

$(function(){
	ajaxLoad(0);
})