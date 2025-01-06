## API Gateway 프로젝트

### 프로젝트 개요
Spring Cloud Gateway와 Redis를 이용하여 API 요청을 관리하고 요청 속도를 제한하는 시스템입니다.

### 주요 기능:
- API Gateway: 요청을 백엔드 서비스로 라우팅.
- 요청 속도 제한: Redis를 이용해 사용자별 요청 속도를 제어.
- Custom Key Resolver: 사용자 요청에서 쿼리 매개변수를 이용해 고유 키 생성.

### 기술 스택
- Java 21
- Spring Boot 3.4.1
- Spring Cloud Gateway
- Redis

