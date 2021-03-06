// 문자열 다루기
package ex5

println "문자열 속에 '그냥문자로취급'한다."
println '문자열 속에 "그냥문자로취급"한다.'
println "큰 따옴표 \"도 그냥 문자로 사용하고 싶고, 작은 따옴표 '도 문자로 사용하고 싶다"

// " 문자나 ' 문자를 모두 문자열에 자유롭게 사용하고 싶다면
// / 문자 안에 두어라!
// 단 괄호로 묶어라!
println ( /큰 따옴표 "도 그냥 문자로 사용하고 싶고, 작은 따옴표 '도 문자로 사용하고 싶다/ )

// 여러 줄에 걸쳐서 문자열을 작성 하고 싶다면 """ 안에 둔다.
println """
오호라!!!
이렇게 여러줄에 걸쳐서
문자열을 작성할수 있으니
이 얼마나 좋을쏘냐!
"""

// 문자열 속에 변수 값을 넣기
// 예전 방식
name = "홍길동"
age = 20

println name + "님의 나이는 " + age + " 입니다."
println "$name 님의 나이는 $age 입니다."

