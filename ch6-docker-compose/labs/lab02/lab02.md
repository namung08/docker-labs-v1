### lab02

```
ch5-multi-containers에서 구축했던 hello-world 풀스택 프로젝트를 도커 컴포즈를 사용해 재구축해보세요.
```

#### 실습 목표

```
hello world 풀스택 프로젝트를 컨테이너로 배포하세요.
- (1) `frontend/` : Next.js로 작성된 프론트엔드 앱
- (2) `backend/` : frontend에게 인삿말 API를 제공하는 스프링부트 백엔드 앱
- (3) database는 스프링부트 백엔드 구조를 파악하여 컨테이너로 별도 구축 (Postgres 혹은 MySQL 사용)
```

#### 참고사항

- 각 서비스(프론트/백엔드/DB)는 별도의 Docker 컨테이너로 배포
- 커스텀 네트워크 생성 및 3개 컨테이너 모두 해당 네트워크에서 동작
- frontend와 backend 컨테이너는 서로 컨테이너 이름 기준으로 통신
- 컨테이너 재빌드/재시작 후에도 정상 동작해야 함