# screenplay-pattern-template
Projeto de testes automatizados no padrão ScreenPlay (the Journey Pattern) para servir como template para implementações e estudos

Em construção.

Flow explicativo do Pattern ScreenPlay.

```
graph TD;
  Actor-->|Asks| Questions;
  Questions-->|abaout the state of| WebPageorAPI;
  Actor-->|perform| Tasks;
  Actor-->|has| Abilities;
  Abilities-->|enable| Actions;
  Tasks-->|made up of| Actions;
  Actions-->|interact with| WebPageorAPI;
```