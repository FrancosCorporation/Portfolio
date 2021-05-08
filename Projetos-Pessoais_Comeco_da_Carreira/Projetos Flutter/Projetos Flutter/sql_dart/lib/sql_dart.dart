import 'package:mysql1/mysql1.dart' as mysql;
import 'dart:io';

void sqlDart() async {
  var setting = mysql.ConnectionSettings(
      host: '168.227.78.131',
      db: 'mysql',
      port: 3306,
      user: 'remote',
      password: 'remote@135');

  try {
    var conn = await mysql.MySqlConnection.connect(setting);

    while (true) {
      try {
        stdout.write('sql> ');
        var query = stdin.readLineSync();
        var result = await conn.query('$query;');
        for (var row in result) {
          print('${row[0]}');
        }
      } catch (e) {
        print(e);
      }
    }
  } catch (e) {
    print(e);
  }
}

/**
  'Server=168.227.78.131;'
  'PORT=3306;'
  'Database=mysql;'
  'UID=odbc;'
  'PWD=senha_odbc;'
  'Trusted_Connection=yes;'
 */
