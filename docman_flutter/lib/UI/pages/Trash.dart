import 'package:flutter/material.dart';

class Trash extends StatefulWidget {
  const Trash({Key key}) : super(key: key);

  @override
  _TrashState createState() => _TrashState();
}

class _TrashState extends State<Trash> {
  @override
  Widget build(BuildContext context) {
    return Container(
      child: Text("Trash"),
    );
  }
}
