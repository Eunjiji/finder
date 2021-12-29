package movie.finder.service;

import movie.finder.domain.Member;
import movie.finder.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public Long join(Member member) throws IllegalAccessException {
        validateDuplicateMember(member);
        memberRepository.save(member);
        System.out.println("email : " + member.getEmail());
        return member.getId();
    }

    public Member findOne(Long id){
        return memberRepository.findOne(id);
    }

    public List<Member> findAll(){
        return memberRepository.findAll();
    }

    private void validateDuplicateMember(Member member) throws IllegalAccessException {
        List<Member> findMembers = memberRepository.findByEmail(member.getEmail());
        if(!findMembers.isEmpty()){
            throw new IllegalAccessException("이미 존재하는 회원입니다.");
        }

    }

}
