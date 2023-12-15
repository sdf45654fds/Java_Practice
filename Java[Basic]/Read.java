깃허브 = https://github.com/2023-12-java-developer-149
구글드라이브= https://drive.google.com/drive/folders/1bTqyPV9LQt8vly7V_bixG2kpu6THkB7w

content assist : crtl + space
new : crtl + n
public static void main(String[] args) : main > ctrl+space >enter
한라인 복사 : ctrl + alt + up,down
코드정렬단축키 = shift + tab
포멧 단축키 = ctrl + shift + f
브레이크포인트 = crtl + shift + b
디버깅 = f11
다음라인 = f6
줄 제거 = ctrl + d

bit=비트(bit, binary digit)는 하나의 비트는 0이나 1의 값을 가질 수 있고, 각각은 참, 거짓 혹은 서로 배타적인 상태를 나타낸다.

0b - 2진수
0 - 8진수
0x,\u - 16진수
2비트 4개 = 16비트  

스레드 = 실행흐름
디버그 = 오류나 비정상적인 연산을 찾고 수정

패키지 = 클래스들을 그룹단위로 묶어둔 것


지역 내부 클래스 : 메소드 안에 클래스가 만들어진것. / 메소드 내에서만 사용할 수 있는 클래스다

클래스명 앞에 final 이 붙을 시 상속이 불가능해진다
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
비교 연산자 = boolean
: 왼쪽이 더 크냐
< : 오른쪽이 더 크냐
= : 왼쪽이 더 크거나 같냐
<= : 오른쪽이 더 크거나 같냐
== : 둘이 똑같냐
!= : 둘이 다르냐

논리 연산자 = and 나 or
&& = and 의미
|| = or 의미

연산자 우선순위 =
1. ( ) / [ ] 최우선
2. ! , ~ , ++ , -- 증감연산자
3. * , / ,% 곱셈 나눗셈
4. < , > , 비교연산자
5. && and 연산자
7. || or 연산자
8. ? : 조건연산자
9. = , += , -= , /=
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
상수(Constant)
재할당이 금지된 변수 / 변수 값이 변하면 안될 때 사용한다
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
지역변수(local variable) = 클래스블록을 제외한 블록안에 선언된 변수
지역변수의 범위 = scope (선언된 블록안에서만 사용가능)
메소드 안이나 { } 괄호 안에서만 작동하는 변수를 지역변수라고 부른다 .
( 스택 영역에 저장) 지역변수는 직접 초기화 하지 않으면 오류가 일어난다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
매개변수(Parameter) 메소드로 전달되는 값을 저장하는 변수
메서드를 정의할 때 선언한 변수인 String str , int age 를 매개변수, 파라미터라 한다.
메서드를 호출할 때 인수를 넘기면, 그 인수가 매개변수에 대입된다.
실무에서는 매개변수, 파라미터 용어를 모두 사용한다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
타입 = 데이터의 형
기본 타입 = 숫자 , 문자 , 비교하는 것들을 정하는 타입을 말한다
참조 타입 = 변수 , 상수 , 메소드 , 클래스 등 , 숫자나 문자 가 아니라, 데이터의 주소를 가지고 오는것을 말한다

정수 타입 = byte , short , int , long 4가지 종류가 있다
byte = 1byte 크기 ( 메모리셀 1개 )
short = 2byte 크기
int = 4byte 크기
long = 8byte 크기 (Long 타입의 변수에 실수형 리터럴을 할당할 때 는 뒤에 L 를 붙여야 한다)

실수타입 = float , double
float = 4byte 크기 (float 타입의 변수에 실수형 리터럴을 할당할 때 는 뒤에 f 를 붙여야 한다)
double = 8byte 크기
논리 타입
boolean 이라는 한가지 타입만 존재한다 ( 참 , 거짓 ) / ture / false / 1byte 크기를 가진다
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
오버 플로우 : 양수 형태로 타입의 리터럴할 데이터 크기가 넘어가는 경우 / +1 했을때 순환해 리터럴 값은 -128이 된다
언더 플로우 : 음수 형태로 타입의 리터럴할 데이터 크기가 넘어가는 경우 / -1 했을때 반대로 순환해 리터럴 값은 127이 된다
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
class = 사용자정의 데이터
참조변수 
배열=객체

클래스 이외엔 대문자 안쓰는거 권장
변수 이름에 첫 단어는 소문자 , 두번째 단어 첫글자부터는 대문자가 관례이다

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
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
맴버(member)
맴버 = static 과 instance 를 합쳐서 부르는 말이거나 / 변수와 클래스 메소드를 합쳐서 부르는 말이다
보통 필드 + 메소드 를 합쳐서 맴버라고 부른다
맴버 변수 = 클래스 안에 선언된 변수라는 의미이다 . ( 클래스 변수 + 인턴스 변수 == 맴버 변수 )
인스턴스 맴버 = class + variable + method == instance member 라고 부른다
스태틱 맴버 / 클래스 맴버 ( static member ) : static 클래스 + static 변수 + static 메소드 == 스태틱 맴버
인스턴스를 생성하지 않아도 바로 사용 할 수 있다 ( 클래스명 . 맴버명 )
맴버 내부 클래스 = static inner class + inner class == member innerclass 라고 부른다
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
객체(인스턴스)
인스턴스화는 그냥 원본을 갔다 쓰면, 내가 클래스에 적은 값이 수정되기 때문에
복사해서 메모리에(힙 영역에 저장해) 똑같은걸 하나더 만든 후, 이름을 사용하는 과정이다
new 도 연산자이다
속성 = 객체 의 필드를 속성이라고 부른다
기능 = 객체 의 메소드를 기능이라고 부른다
맴버 = 속성 , 기능 , 이너클래스를 맴버 ( member ) 라고 부른다
. : 해당 인스턴스안을 보세요 라는 의미 ( 필드 or 메소드 )
반환 타입이 void 인 경우 : 메소드 내에서 연산 , 문법 같은걸 사용하지 않을때 쓴다
new : 인스턴스화 하겠다고 선언하는것이다.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
클래스(class)
객체를 생성하기 위한 필드와 메소드가 정의된 것. 객체의 설계도에 해당한다
클래스명은 관례상 대문자로 시작
클래스 구성 요소는 4가지 로 생성자 , 메소드 , 이너클래스 , 필드 가 있다
1. 필드(field) = 클래스 내에 존재하는 변수 , 상수, 매서드 밖에 있는 변수
                클래스 변수 , 인스턴스 변수 , 지역 변수 3가지가 있다
                필드는 선언만 하면 자동 초기화로 element는 0을 가진다.
                클래스 변수 , 인스턴스 변수 = 맴버 변수라고 부른다
  
2. 생성자(constructor) = 클래스 안에는 무조건 1개 이상의 메소드가 존재해야 하는데 , 클래스명과 같은 이름의 메소드를 생성자라고 한다
                        클래스 내에 반드시 존재하는 메소드로 인스턴스화 할때 필드를 초기화 하는 메소드이다
                        생성자의 이름은 반드시 클래스의 이름과 같아야 한다
                        생성자는 리턴 타입이 없다
                        생성자도 오버로딩이 가능하다
                        생성자에 매개변수가 있는 경우 해당 값을 받아 초기화 하는데 사용한다
                        ( 인스턴스화 할때 생성자 괄호 안에 인자를 적어줌 )
                        클래스타입 변수명 = new 생성자( 생성자 인자 작성란 )
                        매개변수가 있는 생성자의 경우 인스턴스화 후 필드를 하나씩 초기화 하거나 재대입 해줄 필요가 없다
                          this ( ) : 클래스의 default생성자를 호출 한다 / this () 를 작성하는 부분의 클래스 생성자
                          this ( ) 는 생성자 내부에서만 사용이 가능하고 , 메소드의 첫 줄에 위치해야 한다
                          
                          this.변수명 : 매개변수인지 필드 변수인지 구분하기 위해 작성해준다
                          this. 를 적으면 필드라는 의미이다
                          
                          super : 상위 클래스의 필드를 호출한다 
                          super ( ) : 상위 클래스의 생성자를 호출 한다

3.메소드(method)= 어떤 일을 처리하는 실행문들을 모아 놓은 블록. 메소드를 코드 내에서 사용하는 것을 메소드 호출이라 한다.
                  함수라고도 부름, 메소드 이름은 관례상 소문자로 표기한다
4. 이너 클래스 : 클래스 안에 클래스를 하나더 만든것 ( 캡슐화 때문에 사용하는 경우가 있다 )
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
  

클래스 변수 : static을 사용 한 변수를 클래스 변수라고 부른다
인스턴스 변수 : 내가 일반적으로 사용하는 변수를 인스턴스 변수라고 부른다
클래스 변수와 인스턴스 변수는 클래스 안에 선언되어 있기 때문에 맴버 변수라고 부른다
  

  
통합 개발 환경(IDE: Integrated Development Environment)
프로젝트 생성, 자동 코드 완성, 디버깅 기능을 제공하는 환경(예: Eclipse(자바), Visual Studio(C/C++))

디버깅(debugging)
모의 실행을 해서 코드의 오류를 찾는 행위

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
변수(variable)

하나의 값을 저장할 수 있는 메모리의 공간. 프로그램에 의해서 수시로 값이 변동될 수 있다.
하나의 변수에는 오로지 하나의 값만 저장할 수 있고, 자바에서는 선언된 변수에 한 가지 종류의 값만 저장할 수 있다.

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

재할당 = 초기화 이후에 변수의 값을 다시 넣어주는것

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

if문 : 괄호 내의 조건식이 참이면 블록 내의 문장을 실행.
else문 : if문의 조건식이 거짓이면 블록 내의 문장을 실행. 필요 없으면 없어도 됨.
else if문 : if문의 조건식이 거짓일 때 실행시킬 코드에 추가 조건을 걸고 싶을 때 사용. 마찬가지로 필요 없으면 else if를 사용하지 않아도 됨.
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
반복문(loop)
특정 조건을 만족하는 동안 반복해서 실행하는 문법

for문 : 반복 횟수가 정해진 경우에 주로 사용
while문 : 반복 횟수를 모를 때 주로 사용
do-while문 : 조건 만족 여부와 상관없이 코드를 먼저 실행하고, 그 다음 루프부터 조건을 검사
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

String 타입의 메서드 종류
equals ( 비교할문자열 ) = 같다 / 문자열로 비교 해준다

메소드 오버로딩 ( method overloading ) : 같은 이름의 메소드가 여러개의 기능을 하는것을 말한다
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
입출력
1. System.out.print( ) : 콘솔에 단순히 출력해 준다 / 줄바꿈은 없음
2. System.out.println( ) : line 콘솔에 출력해주고 콘솔 다음줄로 이동한다 / 콘솔바가 다음줄로 이동함
3. System.out.printf( ) : formatted 원하는 형식으로 출력해준다
%s 문자열로 출력
%d 10진수로 출력
%n 콘솔을 다음 줄로 바꿈 / 사실상 엔터
%b boolean 으로 출력
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
캡슐화
캡슐화 : 데이터를 외부로부터 보호하기 위한 조치 ( 데이터 변경 보호 , 데이터 노출방지 )
접근제어자 = public , protected , default , private
private : 동일 클래스에서만 접근 가능
default : 동일 패키지 내에서만 접근 가능
protected : 동일 패키지 + 다른 패키지의 하위 클래스에서 접근 가능
public : 접근 제한 없음

getter ( ) / setter ( ) : 캡슐화를 하며 데이터의 변경이 필요 할 때 사용
보통 private 의 클래스 내에 있는 필드 데이터 수정이 필요할 때 사용한다.
직접적인 접근은 안되니깐 get 메소드와 set 메소드를 만들어 데이터를 변경 할 수 있게 해주는것이다.
get : 필드의 element를 부르거나, 읽어올 때 사용한다
set : 필드의 element를 수정, 변경할 때 사용한다
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
배열
배열 : 변수 하나에 element 여러개 저장 하고 싶을때 사용하면 편하다 . ( 타입은 같아야함 )
연관성 있는 값 끼리 묶어주면 그룹화 해서 사용하기 편하다. 예 : 달력

index = 배열 안에 들어있는 element의 순서를 인덱스라고 한다 / 0 부터 시작한다
element : 인덱스에 들어있는 값을 요소라고 한다 ( element )

선언+초기화 : 타입[ ] 변수명 = new 타입 [ ] { element0 , element1 , element2 , element3 , element4 }
( 여기서 new 타입 은 생략이 가능하다 / 어차피 무조건 똑같이 적어야 하는거니깐 .. )

2차원 배열 : 배열 안에 배열이 존재하는걸 2차원 배열이라고 한다
선언+초기화 : 타입[][] 변수명 = { element0 , element1 , element2 } , { element0 , element1 , element2 }
index 하나에 여러개의 element 를 가질 수 있다 .

가변 배열 : 2차원 배열 이상의 자유로운 형태의 배열
선언+초기화 : 타입[][] 변수명 = { element0 , element1 , element2 , element3 } , { element0 , element1 , element2 } ;

.length ( ) : 배열의 길이를 불러 올 수 있다
Arrays.toString( ) : 배열을 문자열로 바꿔준다 . ( element 를 확인할 때 사용한다 )
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ




  
