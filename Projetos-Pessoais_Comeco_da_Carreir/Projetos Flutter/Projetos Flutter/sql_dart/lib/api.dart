import 'package:http/http.dart' as http;
import 'dart:convert' as convert;

void api() async {
  var url = 'https://api.hgbrasil.com/finance?format=json&key=f0778a29%27';
  var response = await http.get(url);
  if (response.statusCode == 200) {
    Map jsonDecode = convert.jsonDecode(response.body);
    print(jsonDecode);
  } else {
    print('erro');
  }
}
