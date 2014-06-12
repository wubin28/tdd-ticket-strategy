tdd-ticket-strategy
===================

自动取号系统的TDD练习项目。

选用了ThoughtWorks Studio的培训师和教练Luca Minudel在两年前设计的编程操练系列题目TDD with Mock Objects。该系列4个小题目中的第3个：自动取号系统。​


自动取号系统：类似于去银行办事进门时取号的那种取号机。有3个类：TurnTicket类表示要取的票，保存着票上印着的号码；TurnNumberSequence类用于产生所有票上的号码；TicketDispenser根据从TurnNumberSequence类获得的号码来出票。操练要求为TicketDispenser类编写单元测试，而且要求在有多个取号机TicketDispenser的情况下，两个人分别在两台取号机上不能取到同样号码的票。​


本练习假定号码生成器可以指定，若不能指定的话，测试的写法就很
