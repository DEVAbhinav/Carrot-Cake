function AB (name) {
	this.name = name;
	
}

AB.prototype.speak = function () {
		console.log("hello "+ this.name);
	};

function BC(name) {
	AB.call(this, name);
}

var a = new BC("abhinav");
console.log(a.name);
console.log(a.speak());