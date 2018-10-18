/**
 * 
 */

//删除

function ajaxLoad(id){
	var pageNum=$("#pageNum").val()==""||$("#pageNum").val()==undefined?1:$("#pageNum").val();
	var userName=$("#userName").val()==""||$("#userName").val()==undefined?null:$("#userName").val();
	var userRole=$("#userRole").val()==""||$("#userRole").val()==undefined?0:$("#userRole").val();
	var uid=id==""||id==undefined?0:id;
	console.info(uid);
	if(uid>0){
		if(confirm("确认删除？")){
			
		}else{
			uid=0;
		}
	}
	
	$.ajax({
		url:"../user/to_user_all_list",
		type:"post",
		data:{pageNum:pageNum,userName:userName,userRole:userRole,id:uid},
		success:function(result){
			$("#userList").html(result);
			
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