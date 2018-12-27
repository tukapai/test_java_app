import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <p>
            Edit <code>src/App.js</code> and save to reload.
          </p>
          <h1>Hello world!</h1>,
          <a
            className="App-link"
            href="https://reactjs.org"
            target="_blank"
            rel="noopener noreferrer"
          >
            Learn React
          </a>
        </header>
        <div>
//   <div className="main">
//     <h1>ログイン</h1>
//     <form onSubmit={this.handleSubmit}>
//       <input placeholder="userid"/>
//       <input placeholder="password"/>
//       <div style={{textAlign:"center"}}>
//         <button type="submit">ログイン</button>
//       </div>
//     </form>
//   </div>
// </div>
      </div>
    );
  }
}

export default App;
