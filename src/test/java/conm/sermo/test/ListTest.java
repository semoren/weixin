package conm.sermo.test;

import java.util.ArrayList;
import java.util.List;

import com.sermo.po.AccessToken;

public class ListTest {
	public static void main(String[] args) {
		List<AccessToken> list = new ArrayList<AccessToken>();
		AccessToken token1 = new AccessToken();
		token1.setExpires_in(1);
		token1.setToken("1");
		AccessToken token2 = new AccessToken();
		token2.setExpires_in(2);
		token2.setToken("2");
		list.add(token1);
		list.add(token2);
		token2.setExpires_in(3);
		list.set(1, token2);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
