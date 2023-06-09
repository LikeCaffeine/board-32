package idusw.springboot3.service;

import idusw.springboot3.domain.Member;

import java.util.List;

public interface MemberService {
    int create(Member m);
    Member read(Member m);  // mno 값을 넘김
    List<Member> readList();
    int update(Member m);
    int delete(Member m);
}
