package jpabook.jpashop.model

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional
import spock.lang.Specification

@SpringBootTest
class MemberRepositoryTest extends Specification {

    @Autowired
    MemberRepository memberRepository;

    @Transactional
    def "Repository가 작동하는지 확인한다"() {
        given:
        def member = new Member()

        when:
        member.setUsername("memberA")
        def saveId = memberRepository.save(member)
        def findMember = memberRepository.find(saveId)

        then:
        findMember.getId() == member.getId()
    }

    def "왜 안돼?"() {
        given:
        def a = 1
        def b = 2

        when:
        def c = a + b

        then:
        c = 3
    }
}
