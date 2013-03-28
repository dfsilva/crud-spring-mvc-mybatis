var newUserId;
var addUrl = "app/registration/add";
var deleteUrl = "app/registration/delete";
var updateUrl = "app/registration/update";

function setUpdateForm(element){
	newUserId = document.userForm.id.value;
	trElement = document.getElementById(element);
	document.userForm.id.value = element;
	document.userForm.name.value = trElement.children[0].innerHTML;
	document.userForm.standard.value = trElement.children[1].innerHTML;
	document.userForm.age.value = trElement.children[2].innerHTML;
	changeSelectValue(document.userForm.sex, trElement.children[3].innerHTML);
	document.userForm.newUser.disabled = false;
	document.userForm.deleteUser.disabled = false;
	document.userForm.action = projectUrl + updateUrl;
}

function setAddForm(){
	document.userForm.id.value = newUserId;
	document.userForm.name.value = "";
	document.userForm.standard.value = "";
	document.userForm.age.value = "";
	changeSelectValue(document.userForm.sex, "Male");
	document.userForm.newUser.disabled = true;
	document.userForm.deleteUser.disabled = true;
	document.userForm.action = projectUrl + addUrl;
}

function setDeleteForm() {
	document.userForm.action = projectUrl + deleteUrl;
	return true;
}

