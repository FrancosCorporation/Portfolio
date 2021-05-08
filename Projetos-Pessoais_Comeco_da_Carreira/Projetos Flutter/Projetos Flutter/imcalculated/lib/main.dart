import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    home: Home(),
    debugShowCheckedModeBanner: false,
  ));
}

class Home extends StatefulWidget {
  @override
  _HomeState createState() => _HomeState();
}

class _HomeState extends State<Home> {
  TextEditingController weigthController = TextEditingController();
  TextEditingController heightController = TextEditingController();
  String _infoText = "Informe os seus dados !!";
  GlobalKey<FormState> _formKey= GlobalKey<FormState>();
  void _resetFields() {
    weigthController.text = "";
    heightController.text = "";
    setState(() {
    _infoText = "Informe os seus dados !";
    });
    
  }
  void calculate(){
    setState(() {
    double weight = double.parse(weigthController.text);
    double height = double.parse(heightController.text)/100;
    double imc = weight/(height*height);

    if(imc<18.6){
_infoText = "Abaixo do Peso (${imc.toStringAsPrecision(4)})";

    }
    else if(imc>18.6&&imc<25){
_infoText = "Esta na medida (${imc.toStringAsPrecision(4)})";
    }
    else if(imc>25){
_infoText = "Esta Obeso (${imc.toStringAsPrecision(4)})";
    }
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
            title: Text("Calculadora de IMC"),
            centerTitle: true,
            backgroundColor: Colors.green,
            actions: <Widget>[
              IconButton(icon: Icon(Icons.refresh), onPressed: () {_resetFields();})
            ]),
        backgroundColor: Colors.white,
        body: SingleChildScrollView(
          padding: EdgeInsets.fromLTRB(10.0, 0, 10, 0),
          child: Form(
            key: _formKey,
             child: Column(
            crossAxisAlignment: CrossAxisAlignment.stretch,
            children: <Widget>[
              Icon(Icons.person_outline, size: 120, color: Colors.green),
              TextFormField(
                keyboardType: TextInputType.number,
                decoration: InputDecoration(
                    labelText: "Peso (KG)",
                    labelStyle: TextStyle(color: Colors.green),
                    alignLabelWithHint: true),
                textAlign: TextAlign.center,
                style: TextStyle(color: Colors.green, fontSize: 25),
                controller: weigthController,
                validator: (value){
                  if(value.isEmpty){
                    return "insira seu peso !";

                  }
                },
              ),
              TextFormField(
                keyboardType: TextInputType.number,
                textAlign: TextAlign.center,
                decoration: InputDecoration(
                  labelText: "Altura (CM)",
                  labelStyle: TextStyle(color: Colors.green),
                  
                ),
                //textAlign: TextAlign.center,
                style: TextStyle(color: Colors.green, fontSize: 25),
                controller: heightController,
                 validator: (value){
                  if(value.isEmpty){
                    return "insira sua altura !";

                  }
                },
              ),
              Padding(
                padding: EdgeInsets.only(top: 10, bottom: 10),
                child: Container(
                  height: 50,
                  child: RaisedButton(
                    onPressed: () {if(_formKey.currentState.validate()){
calculate();
                    }},
                    child: Text(
                      "Calcular",
                      style: TextStyle(color: Colors.white, fontSize: 20),
                    ),
                    color: Colors.green,
                  ),
                ),
              ),
              Text(
                _infoText,
                textAlign: TextAlign.center,
                style: TextStyle(color: Colors.green, fontSize: 25),
              )
            ],
          ),)
        ));
  }
}
