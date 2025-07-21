## Docker Desktop 설치

- 운영체제에 맞게 Docker Desktop 설치
- 윈도우 사용자는 Docker Desktop 설치하면 하나의 도커엔진으로 윈도우 호스트와 WSL 동시 사용 가능
- WSL에서 도커 사용하려면 docker desktop 앱 실행 -> 설정 -> Resources -> WSL integration -> 리눅스 활성화 토글 -> `Apply & restart`
- 실행하려는 운영체제에서 `docker -v` 명령 (도커 엔진이 정상적으로 설치되면 버전 정보 조회 가능)
- `docker run hello-world` 명령으로 간단히 컨테이너 실행 테스트

### [참고] 도커 사용자용 계정 만들기

#### 사용자 생성 및 권한 부여

```bash
sudo adduser dockeruser
sudo usermod -aG sudo dockeruser
sudo usermod -aG docker dockeruser
```

#### WSL 디폴트 유저 변경

```bash
# 아래 명령으로 설정 파일 열기
sudo vim /etc/wsl.conf

# [user] 항목 아래에 default 값을 추가하거나 수정
[user]
default=dockeruser

# 저장 후 WSL을 완전히 종료
wsl --shutdown
```
