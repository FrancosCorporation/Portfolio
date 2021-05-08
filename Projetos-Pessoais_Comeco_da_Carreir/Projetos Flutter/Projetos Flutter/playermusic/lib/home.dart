import 'package:flutter/material.dart';
import 'package:playermusic/player.dart';

class Home extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Music Player',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(primarySwatch: Colors.blue),
      home: PaginaCriaStatus(),
    );
  }
}

class PaginaCriaStatus extends StatefulWidget {
  @override
  _ClasseDeEstado createState() => _ClasseDeEstado();
}

class _ClasseDeEstado extends State<PaginaCriaStatus> {
  Icon cusIcon = Icon(Icons.search);
  Widget cusSerchBar = Text('Your Bass Player');
  Widget sendButton = Icon(Icons.send);
  Widget PlayStop = PlayerPlay();
  Widget _vai = PlayerPrevius();
  Widget Next = PlayerNext();
  Widget Previus = PlayerPrevius();
  bool visibiliteOfSendButton = false;
  final _text = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.black54,
      appBar: AppBar(
        centerTitle: true,
        backgroundColor: Colors.green[300],
        actions: <Widget>[
          Visibility(child: IconButton(icon: sendButton, onPressed: (){
           
          }),
          visible: visibiliteOfSendButton,
          ),
          IconButton(
              icon: cusIcon,
              onPressed: () {
                setState(() {
                  if (this.cusIcon.icon == Icons.search) {
                    this.cusIcon = new Icon(Icons.close);
                    this.visibiliteOfSendButton = true;
                    this.cusSerchBar = new TextField(
                      controller: _text,
                      textInputAction: TextInputAction.go,
                      decoration: InputDecoration(
                          hintText: "Search Your Music, Artist or Genre"),
                      onSubmitted: (String str) {
                        setState(() {
                          _text.text = str;
                        });
                      },
                    );
                  } else {
                    this.cusIcon = Icon(Icons.search);
                    this.cusSerchBar = Text('Your Bass Player');
                    this.visibiliteOfSendButton = false;
                  }
                });
              })
        ],
        title: cusSerchBar,
      ),
      drawer: Drawer(
        child: ListView(
          
        ),
      ),
      body:
       Column(
        children: <Widget>[
          Expanded(
            flex: 9,
            child: Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                Text(_text.text),
              ],
            ),
          ),
          Expanded(
            flex: 1,
            children<widget>{}
          ),
        ],
      ),
    );
  }
}
