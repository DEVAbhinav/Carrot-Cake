function range( a, b) {
	var array = [];
	for(var count = a;count<=b;count++)
		array.push(count);
	console.log(array);

}

//range(1,10);


function reduce(array, combine, start) {
	var current = start;
	array.forEach(function (element) {
		current = combine(element,current);
	});
	return current;
}

console.log(reduce([2,4,5,7,5,4,-6],function (a,b) {
	// body...
	return a>b?b:a;
},100));
