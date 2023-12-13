깃허브 = https://github.com/2023-12-java-developer-149
구글드라이브= https://drive.google.com/drive/folders/1bTqyPV9LQt8vly7V_bixG2kpu6THkB7w

content assist : crtl + space
new : crtl + n
public static void main(String[] args) : main > ctrl+space >enter
한라인 복사 : ctrl + alt + up,down
앞에 보라색= 예약어 / 그 뒤 빨간색 식별자

bit=비트(bit, binary digit)는 하나의 비트는 0이나 1의 값을 가질 수 있고, 각각은 참, 거짓 혹은 서로 배타적인 상태를 나타낸다.

0b - 2진수
0 - 8진수
0x,\u - 16진수
2비트 4개 = 16비트  

스레드 = 실행흐름
디버그 = 오류나 비정상적인 연산을 찾고 수정


코드정렬단축키 = shift + tab
포멧 단축키 = ctrl + shift + f
브레이크포인트 = crtl + shift + b
디버깅 = f11
다음라인 = f6
줄 제거 = ctrl + d

지역변수(local variable) = 클래스블록을 제외한 블록안에 선언된 변수
지역변수의 범위 = scope (선언된 블록안에서만 사용가능)

타입 = 데이터의 형
class = 사용자정의 데이터
참조변수 
배열=객체

클래스 이외엔 대문자 안쓰는거 권장

컴파일(compile)
컴퓨터가 이해할 수 있도록 0과 1로 이루어진 기계어로 변환하는 과정

객체 지향 프로그래밍(OOP: Object Oriented Programming)
프로그램을 개발하는 기법으로, 부품에 해당하는 객체들을 먼저 만들고 이것들을 하나씩 조립 및 연결해서 전체 프로그램을 완성하는 기법

자바 가상 기계(JVM: Java Virtual Machine)
자바 프로그램은 완전한 기계어가 아닌 중간 단계의 바이트 코드이기 때문에, 이것을 해석하고 실행할 수 있게 해주는 가상의 운영체제

자바 개발 도구(JDK: Java Development Kit)
프로그램에 필요한 자바 가상 기계(JVM), 라이브러리 API, 컴파일러 등의 개발 도구가 포함된 소프트웨어 패키지

자바 실행 환경(JRE: Java Runtime Environment)
자바 프로그램 실행에 필요한 자바 가상 기계(JVM), 라이브러리 API가 포함된 소프트웨어 패키지

실행문
변수 선언, 값 저장, 메소드 호출에 해당하는 코드

클래스(class)
객체를 생성하기 위한 필드와 메소드가 정의된 것. 객체의 설계도에 해당한다

메소드(method)
어떤 일을 처리하는 실행문들을 모아 놓은 블록. 메소드를 코드 내에서 사용하는 것을 메소드 호출이라 한다.

통합 개발 환경(IDE: Integrated Development Environment)
프로젝트 생성, 자동 코드 완성, 디버깅 기능을 제공하는 환경(예: Eclipse(자바), Visual Studio(C/C++))

디버깅(debugging)
모의 실행을 해서 코드의 오류를 찾는 행위

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
변수(variable)

하나의 값을 저장할 수 있는 메모리의 공간. 프로그램에 의해서 수시로 값이 변동될 수 있다. 하나의 변수에는 오로지 하나의 값만 저장할 수 있고, 자바에서는 선언된 변수에 한 가지 종류의 값만 저장할 수 있다.

로컬 변수(지역 변수): 메소드 블록 내에서 선언된 변수. 로컬 변수는 메소드 실행이 끝나면 메모리에서 자동으로 없어짐
변수 선언: 어떤 식별자를 갖고, 어떤 데이터를 가지고 시작하는 변수라는 것을 알리는 것
할당 :변수에 값을 넣거나 저장하는 것을 ‘할당한다’고 함//메모리에 변수의 값이 들어갈 공간을 할당해야 하기 때문
참조: 변수에 접근하는 것을 ‘참조한다’고 함
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

예약어(reserved word)
이미 해당 프로그래밍 언어에서 사용하기 위해 의미가 정해져 있는 것

초기값(initial value)
변수를 선언하고 처음 저장하는 값

초기화(initialize)
변수에 초기값을 주는 행위

리터럴(literal)
소스코드 내에서 직접 입력된 값
사실 리터럴은 상수와 같은 의미지만, 프로그램에서는 상수를 “값을 한 번 저장하면 변경할 수 없는 변수”로 정의하기 때문에 이와 구분하기 위해 “리터럴”이라는 용어를 사용한다.

자료형(data type)
자료의 형태. 자료형에 따라 컴퓨터가 어떻게 처리하는지 달라진다. 자바에서는 기본 타입과 참조 타입으로 구분됨

기본 타입(primitive type)
원시 타입이라고도 한다. 정수, 실수, 문자, 논리 리터럴을 저장하는 자료형

참조 타입(reference type)
객체의 번지를 참조하는 타입. 배열, 열거, 클래스, 인터페이스 타입이 있다.

연산자(operator)
연산에 사용되는 표시나 기호

피연산자(operand)
연산식에서 연산되는 데이터

부동 소수점(floating point)
소수점이 있는 실수 데이터를 저장하는 방식. ‘부동’은 ‘떠다니다’의 의미, 소수점이 떠다닌다는 의미에서 부동 소수점이다. 이 방식에서는 최상위 비트MSB: Most SignificantBit를 부호로 결정한다. 최상위 비트가 0이면 양수, 1이면 음수를 뜻한다.

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
제어문(control statement)
실행 흐름을 개발자가 원하는 방향으로 바꿀 수 있도록 해주는 것

조건문: if문, switch문
반복문: for문, while문, do-while문
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

조건문(conditional  statement)
특정 조건을 만족할 때 코드를 실행하는 문법

if문: 괄호 내의 조건식이 참이면 블록 내의 문장을 실행.
else문: if문의 조건식이 거짓이면 블록 내의 문장을 실행. 필요 없으면 없어도 됨.
else if문: if문의 조건식이 거짓일 때 실행시킬 코드에 추가 조건을 걸고 싶을 때 사용. 마찬가지로 필요 없으면 else if를 사용하지 않아도 됨.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
반복문(loop)
특정 조건을 만족하는 동안 반복해서 실행하는 문법

for문: 반복 횟수가 정해진 경우에 주로 사용
while문: 반복 횟수를 모를 때 주로 사용
do-while문: 조건 만족 여부와 상관없이 코드를 먼저 실행하고, 그 다음 루프부터 조건을 검사
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
무한 루프(infinite loop)
무한히 반복을 하고 싶거나 정해진 횟수 없이 일정한 조건을 충족하면 빠져나오게 하고 싶을 때 사용하는 것.

null
참조 타입 변수가 객체를 참조하지 않는다는 의미의 값. ‘널’이라고 읽는다. null값도 초기값으로 사용할 수 있기 때문에 null로 초기화된 참조 변수는 스택 영역에 저장된다.

배열(array)
데이터를 연속된 공간에 나열하고, 각 데이터에 인덱스를 부여해 놓은 자료구조. 연속된 공간이라는 성격 때문에 중간 인덱스의 값을 삽입하거나 삭제하기 어렵고, 선언 후 배열의 인덱스 수를 늘릴 수 없다.

인덱스(index)
0에서부터 “문자열(혹은 배열) 길이-1”까지의 번호를 매긴 것. 배열과 같은 선형 자료구조는 인덱스로 원소에 접근할 수 있다.

열거 타입(enumeration type)
한정된 값만을 갖는 자료형

인수(Argument)
여기서 "hello" , 20 처럼 넘기는 값을 영어로 Argument(아규먼트), 한글로 인수 또는 인자라 한다.
실무에서는 아규먼트, 인수, 인자라는 용어를 모두 사용한다.

매개변수(Parameter)
메서드를 정의할 때 선언한 변수인 String str , int age 를 매개변수, 파라미터라 한다.
메서드를 호출할 때 인수를 넘기면, 그 인수가 매개변수에 대입된다.
실무에서는 매개변수, 파라미터 용어를 모두 사용한다.
