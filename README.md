# TestSample
과제전형 수행시 반복 작업을 막기 위해 초기 설정을 적용한 템플릿입니다.

---
## 기술 스택
이 프로젝트에서 사용하는 기술 스택은 다음과 같습니다.

- Java 11 (corretto-11)
- Spring Framework (SpringBoot 3.2.3)
- JPA, Hibernate
- Spring Data JPA, QueryDSL
- MapStruct
- Junit

--- 

### 애플리케이션 실행
애플리케이션 실행을 위해서는 아래 구문을 실행합니다.

```shell
$ make run 
```

위 구문은 내부적으로 `./gradlew bootRun`을 호출합니다. `gradle` 환경 구성에 문제가 있다면 `make init`을 실행한 후, IntelliJ가 제공하는 ▶︎을 대신 사용하여 실행하십시오.

--- 
### DTO <-> Entity Mapping
이 프로젝트에서는 mapstruct를 통해 DTO와 Entity 간의 데이터 매핑을 지원합니다.

---
## JPA
TODO

### JPA Auditing Automation
이 프로젝트에서는 Spring Data JPA에서 감사(Audit) 목적의 컬럼을 자동 처리하도록 지원합니다.

---
## API 표준 디자인 가이드
API 설계 시, 표준 디자인 가이드를 준수해야 합니다. 자세한 내용은 [링크](docs/API_DESIGN_GUIDE.md)를 참고하세요
