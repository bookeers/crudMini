# crudMini
One-day Project로 자바만을 활용하여 CRUD 서비스를 구현하였습니다.

DB 없이, DAO 클래스를 구현하고 Map을 선언하여 DB의 기능을 대체하였습니다.

## Flow

1. 메뉴를 사용자에게 입력받음 (1: 회원가입 / 2: 로그인 / 3: 회원정보 수정 / 4: 탈퇴 / 0: 종료)

2. 각각의 메뉴 별로 제약조건 구현 (로그인 된 상태에선 중복 로그인 불가, 로그인되지 않으면 회원정보의 수정 및 탈퇴 불가)

## Todo

1. 유저가 입력한 데이터의 무결성 검사 강화

2. CLI가 아닌 GUI 환경을 고려해보기

## Diagram

![image](https://github.com/bookeers/crudMini/assets/128025654/480725ae-2155-4fd9-b80d-951b1c5f78b4)
