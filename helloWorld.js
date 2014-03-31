var http = require('http');
// convenient for parsing url
var url = require('url');

// this is how we get access to class BigDecimal
var BigDecimal = Java.type('java.math.BigDecimal');

// parameters and local variables do not have a type, otherwise similar to Java
function calculatePercentage(amount, percentage) {
    var result = new BigDecimal(amount).multiply(new BigDecimal(percentage)).divide(new BigDecimal('100'),
        2, BigDecimal.ROUND_HALF_EVEN);
    return result.toPlainString();
}

function handleRequst(req, res) {
    // calculate is the path of our web service
    if (url.parse(req.url).pathname === '/calculate') {
        var query = url.parse(req.url, true).query;
        // amount and percentage are passed in as query parameters
        var result = calculatePercentage(query.amount, query.percentage);
        res.writeHead(200, {'Content-Type': 'text/plain'});
        res.end(result + '\n');
    }
}

http.createServer(handleRequst).listen(1337, '127.0.0.1');

console.log('server ready');
console.log('Try http://127.0.0.1:1337/calculate?amount=100&percentage=7');