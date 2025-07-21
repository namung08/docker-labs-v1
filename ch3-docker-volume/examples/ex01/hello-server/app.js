const http = require("http");
const PORT = 3000;

const server = http.createServer((req, res) => {
  res.writeHead(200, { "Content-Tpye": "text/plain" });
  res.end("hello world!!");
});

server.listen(PORT, () => {
  console.log(`서버 실행 : http://localhost:${PORT}`);
});
