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
        member.setUsername("memberA")

        when:
        def saveId = memberRepository.save(member)
        def findMember = memberRepository.find(saveId)

        then:
        findMember.getId() == member.getId()
    }
}
