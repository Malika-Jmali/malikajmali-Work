let should = chai.should();

describe('dom-exercise', () => {
 

  it('page title is added to the DOM', () => {
    const title = document.getElementById('title');
    title.innerText.should.equal('My Shopping List');
  });

  it('groceries array should contain 10 items', () => {
    groceries.should.have.lengthOf(10);
  });

  it('groceries are added to the DOM', () => {
    const items = document.querySelectorAll('.shopping-list li');
    items.should.have.lengthOf(10);
  });

  it('should have 0 items with completed', () => {
    const items = document.querySelectorAll('.shopping-list li.completed');
    items.should.have.lengthOf(0);
  });

  it('clicking the button marks all of the items complete', () => {
    markCompleted();
    const items = document.querySelectorAll('.shopping-list li.completed');
    items.should.have.lengthOf(10);
  });
});
