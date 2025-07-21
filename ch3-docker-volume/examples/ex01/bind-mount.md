### 도커파일 작성

```bash
docker build -t hello-server-dev .
```

### 컨테이너 실행

```bash
docker run --name hello-server-dev -p 3001:3000 -d -v $(pwd):/app hello-server-dev
```

### 컨테이너 실행 후 hello-server/app.js 소스 코드 수정

```
res.end("### 이 부분 자유롭게 수정 ###");
```

- 코드 수정 실시간 반영되는지 확인 http://localhost:3001

### [참고] nodemon 동작하지 않는 경우

- 윈도우 c:/ 를 바인드 마운트 디렉토리로 설정한 경우 컨테이너 내부로 실시간 코드 수정은 되지만 nodemon 이 동작하지 않음.
- 이 때는 개발환경 작업 디렉토리를 리눅스 환경에서 하면 동작함.
