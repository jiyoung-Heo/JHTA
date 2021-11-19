function isEmpty(str){
	if(str.length==0||str==""){
		return true;
	}else{
		return false;
	}
}
function isNumber(str){
	for(let i = 0;i<str.length;i++){
		let c = str.charAt(i);
		if(!(c>='0'&& c<='9')){
			return false;
		}
	}
	return true;
}