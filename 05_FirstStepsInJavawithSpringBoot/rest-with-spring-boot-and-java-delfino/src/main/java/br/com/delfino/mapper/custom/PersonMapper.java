package br.com.delfino.mapper.custom;

import org.springframework.stereotype.Service;

import br.com.delfino.data.vo.v1.PersonVO;
import br.com.delfino.data.vo.v2.PersonVOV2;
import br.com.delfino.model.Person;

@Service
public class PersonMapper {
	
	public PersonVO convertEntityToVo(Person person) {
		PersonVO vo = new PersonVO();
		vo.setKey(person.getId());
		vo.setAddress(person.getAddress());
		vo.setFirstName(person.getFirstName());
		vo.setLastName(person.getLastName());
		vo.setGender(person.getGender());
		return vo;
	}
	
	/*public PersonVOV2 convertEntityToVo(Person person) {
		PersonVOV2 vo = new PersonVOV2();
		vo.setId(person.getId());
		vo.setAddress(person.getAddress());
		vo.setBirthDay(new Date());
		vo.setFirstName(person.getFirstName());
		vo.setLastName(person.getLastName());
		vo.setGender(person.getGender());
		return vo;
	}*/
	
	public Person convertVoTOEntity(PersonVOV2 person) {
		Person entity = new Person();
		entity.setId(person.getId());
		entity.setAddress(person.getAddress());
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setGender(person.getGender());
		return entity;
	}
}
